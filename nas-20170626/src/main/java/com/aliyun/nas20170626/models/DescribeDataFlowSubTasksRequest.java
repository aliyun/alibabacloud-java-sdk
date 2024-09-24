// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowSubTasksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-370lx1ev9ss27o0****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeDataFlowSubTasksRequestFilters> filters;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>iWk0AQAAAAAvY2FzZS8=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeDataFlowSubTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowSubTasksRequest self = new DescribeDataFlowSubTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowSubTasksRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeDataFlowSubTasksRequest setFilters(java.util.List<DescribeDataFlowSubTasksRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeDataFlowSubTasksRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeDataFlowSubTasksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDataFlowSubTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class DescribeDataFlowSubTasksRequestFilters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DataFlowSubTaskIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>subTaskId-370kyfmyknxcyzw****</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDataFlowSubTasksRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowSubTasksRequestFilters self = new DescribeDataFlowSubTasksRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowSubTasksRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDataFlowSubTasksRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
