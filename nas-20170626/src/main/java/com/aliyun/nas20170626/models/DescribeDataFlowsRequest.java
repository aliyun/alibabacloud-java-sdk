// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowsRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>CPFS: must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>CPFS for Lingjun: must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The filter keys for querying data flows.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeDataFlowsRequestFilters> filters;

    /**
     * <p>The number of results for each query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the return results are truncated, use NextToken to obtain content starting from the truncation point.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
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
         * <p>The name of the filter key. Valid values:</p>
         * <ul>
         * <li>DataFlowIds: filters by data flow ID.</li>
         * <li>FsetIds: filters by Fileset ID.</li>
         * <li>FileSystemPath: filters by the path of the Fileset in the CPFS file system.</li>
         * <li>SourceStorage: filters by the access path of the source storage.</li>
         * <li>ThroughputList: filters by the transmission bandwidth of the data flow.</li>
         * <li>Description: filters by the description of the Fileset.</li>
         * <li>Status: filters by data flow status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FsetIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter key. Wildcards are not supported for this parameter.</p>
         * <ul>
         * <li><p>If Key is set to DataFlowIds, Value is set to a data flow ID or part of a data flow ID. You can specify one or more data flow IDs. A maximum of 10 data flow IDs can be specified. Example: <code>df-194433a5be31****</code> or <code>df-194433a512a2****,df-234533a5be31****</code>.</p>
         * </li>
         * <li><p>If Key is set to FsetIds, Value is set to a Fileset ID or part of a Fileset ID. You can specify one or more Fileset IDs. A maximum of 10 Fileset IDs can be specified. Example: <code>fset-1902718ea0ae****</code> or <code>fset-235718ea0ae****,fset-5122718ea0ae****</code>.</p>
         * </li>
         * <li><p>If Key is set to FileSystemPath, Value is set to a path or part of a path in the CPFS file system. The value must be 1 to 1024 characters in length.</p>
         * </li>
         * <li><p>If Key is set to SourceStorage, Value is set to the access path of the source storage. The maximum length is 1024 characters.</p>
         * </li>
         * <li><p>If Key is set to ThroughputList, Value is set to the transmission bandwidth of the data flow. Combined queries are supported.</p>
         * </li>
         * <li><p>If Key is set to Description, Value is set to the description or part of the description of the data flow.</p>
         * </li>
         * <li><p>If Key is set to Status, Value is set to the data flow status.</p>
         * </li>
         * <li><p>If Key is set to SourceStoragePath, Value is set to the access path of the source storage or part of the access path. The maximum length is 1024 characters.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FsetIds</p>
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
