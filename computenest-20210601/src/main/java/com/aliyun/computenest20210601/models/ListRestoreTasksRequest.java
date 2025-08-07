// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListRestoreTasksRequest extends TeaModel {
    /**
     * <p>The list of the filters.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListRestoreTasksRequestFilter> filter;

    /**
     * <p>The number of rows displayed per page in paginated queries. Maximum: 100 rows per page. Default: 20 rows.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>NextToken</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListRestoreTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRestoreTasksRequest self = new ListRestoreTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListRestoreTasksRequest setFilter(java.util.List<ListRestoreTasksRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListRestoreTasksRequestFilter> getFilter() {
        return this.filter;
    }

    public ListRestoreTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRestoreTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListRestoreTasksRequestFilter extends TeaModel {
        /**
         * <p>The parameter name of the filter. You can specify one or more parameter names to query services. Valid values:</p>
         * <ul>
         * <li>RestoreTaskId: the ID of the restore task.</li>
         * <li>ServiceInstanceId: The ID of the service instance.</li>
         * <li>Status</li>
         * <li>StartTime</li>
         * <li>EndTime</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ServiceInstanceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter values of the filter.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListRestoreTasksRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListRestoreTasksRequestFilter self = new ListRestoreTasksRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListRestoreTasksRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRestoreTasksRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
