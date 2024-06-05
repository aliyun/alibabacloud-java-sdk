// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The filter that is used to query dataflows.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeDataFlowsRequestFilters> filters;

    /**
     * <p>The number of results for each query.</p>
     * <br>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeDataFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowsRequest self = new DescribeDataFlowsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeDataFlowsRequest setFilters(java.util.List<DescribeDataFlowsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeDataFlowsRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeDataFlowsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDataFlowsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class DescribeDataFlowsRequestFilters extends TeaModel {
        /**
         * <p>The filter name. Valid values:</p>
         * <br>
         * <p>*   DataFlowIds: filters dataflows by dataflow ID.</p>
         * <p>*   FsetIds: filters dataflows by fileset ID.</p>
         * <p>*   FileSystemPath: filters dataflows based on the path of a fileset in a CPFS file system.</p>
         * <p>*   SourceStorage: filters dataflows based on the access path of the source storage.</p>
         * <p>*   ThroughputList: filters dataflows based on dataflow throughput.</p>
         * <p>*   Description: filters dataflows based on the fileset description.</p>
         * <p>*   Status: filters dataflows based on dataflow status.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter. This parameter does not support wildcards.</p>
         * <br>
         * <p>*   If Key is set to DataFlowIds, set Value to a data flow ID or a part of the data flow ID. You can specify a dataflow ID or a group of dataflow IDs. You can specify a maximum of 10 dataflow IDs. Example: `dfid-12345678` or `dfid-12345678,dfid-12345679`.</p>
         * <p>*   If Key is set to FsetIds, set Value to a fileset ID or a part of the fileset ID. You can specify a fileset ID or a group of fileset IDs. You can specify a maximum of 10 fileset IDs. Example: `fset-12345678` or `fset-12345678,fset-12345679`.</p>
         * <p>*   If Key set to FileSystemPath, set Value to the path or a part of the path of a fileset in a CPFS file system. The value must be 2 to 1,024 characters in length. The value must be encoded in UTF-8.</p>
         * <p>*   If Key is set to SourceStorage, set Value to the access path or a part of the access path of the source storage. The value must be 8 to 128 characters in length. The value must be encoded in UTF-8 and comply with the naming conventions of Object Storage Service (OSS) buckets.</p>
         * <p>*   If Key is set to ThroughputList, set Value to the dataflow throughput. Combined query is supported.</p>
         * <p>*   If Key is set to Description, set Value to a dataflow description or a part of the dataflow description.</p>
         * <p>*   If Key is set to Status, set Value to the dataflow status.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDataFlowsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowsRequestFilters self = new DescribeDataFlowsRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDataFlowsRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
