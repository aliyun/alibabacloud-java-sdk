// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowTasksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("Filters")
    public java.util.List<DescribeDataFlowTasksRequestFilters> filters;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeDataFlowTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowTasksRequest self = new DescribeDataFlowTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowTasksRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeDataFlowTasksRequest setFilters(java.util.List<DescribeDataFlowTasksRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeDataFlowTasksRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeDataFlowTasksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDataFlowTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class DescribeDataFlowTasksRequestFilters extends TeaModel {
        /**
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>*   ````</p>
         * <p>*   ````</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*   ``</p>
         * <p>*   ``</p>
         * <p>*   ``</p>
         * <p>*   ``</p>
         * <p>*   ``</p>
         * <p>*   ``</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDataFlowTasksRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowTasksRequestFilters self = new DescribeDataFlowTasksRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowTasksRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDataFlowTasksRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
