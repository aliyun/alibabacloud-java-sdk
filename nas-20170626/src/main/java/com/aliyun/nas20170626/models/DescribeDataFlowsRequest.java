// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-125487\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-0015\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <blockquote>
     * <p> CPFS file systems are available only on the China site (aliyun.com).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64ya****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The filter that is used to query data flows.</p>
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
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
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
         * <p>The filter name. Valid values:</p>
         * <ul>
         * <li>DataFlowIds: filters data flows by data flow ID.</li>
         * <li>FsetIds: filters data flows by fileset ID.</li>
         * <li>FileSystemPath: filters data flows based on the path of a fileset in a CPFS file system.</li>
         * <li>SourceStorage: filters data flows based on the access path of the source storage.</li>
         * <li>ThroughputList: filters data flows based on data flow throughput.</li>
         * <li>Description: filters data flows based on the fileset description.</li>
         * <li>Status: filters data flows based on data flow status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FsetIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value. This parameter does not support wildcards.</p>
         * <ul>
         * <li>If Key is set to DataFlowIds, set Value to a data flow ID or a part of the data flow ID. You can specify a data flow ID or a group of data flow IDs. You can specify a maximum of 10 data flow IDs. Example: <code>df-194433a5be31****</code> or <code>df-194433a5be31****,df-184433a5be31****</code>.</li>
         * <li>If Key is set to FsetIds, set Value to a fileset ID or a part of the fileset ID. You can specify a fileset ID or a group of fileset IDs. You can specify a maximum of 10 fileset IDs. Example: <code>fset-1902718ea0ae****</code> or <code>fset-1902718ea0ae****,fset-1242718ea0ae****</code>.</li>
         * <li>If Key is set to FileSystemPath, set Value to the path or a part of the path of a fileset in a CPFS file system. The value of the parameter must be 1 to 1,024 characters in length.</li>
         * <li>If Key is set to SourceStorage, set Value to the access path or a part of the access path of the source storage. The path can be up to 1,024 characters in length.</li>
         * <li>If Key is set to ThroughputList, set Value to the data flow throughput. Combined query is supported.</li>
         * <li>If Key is set to Description, set Value to a data flow description or a part of the data flow description.</li>
         * <li>If Key is set to Status, set Value to the data flow status.</li>
         * <li>If Key is set to SourceStoragePath, set Value to the access path or a part of the access path of the source storage. The path can be up to 1,024 characters in length.</li>
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
