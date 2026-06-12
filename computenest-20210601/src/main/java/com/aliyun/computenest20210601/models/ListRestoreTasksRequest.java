// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListRestoreTasksRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListRestoreTasksRequestFilter> filter;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
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
         * <p>The name of the filter. You can query by one or more filter names. Valid values:</p>
         * <ul>
         * <li><p>RestoreTaskId: The restore job ID.</p>
         * </li>
         * <li><p>ServiceInstanceId: The service instance ID.</p>
         * </li>
         * <li><p>Status: The status.</p>
         * </li>
         * <li><p>StartTime: The start time.</p>
         * </li>
         * <li><p>EndTime: The end time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ServiceInstanceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A list of filter values.</p>
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
