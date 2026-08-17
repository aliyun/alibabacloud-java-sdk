// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListPoolsRequest extends TeaModel {
    /**
     * <p>The filter conditions for querying resource pools.</p>
     */
    @NameInMap("Filter")
    public ListPoolsRequestFilter filter;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPoolsRequest self = new ListPoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListPoolsRequest setFilter(ListPoolsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public ListPoolsRequestFilter getFilter() {
        return this.filter;
    }

    public ListPoolsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPoolsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class ListPoolsRequestFilter extends TeaModel {
        /**
         * <p>The list of resource pool names to query.</p>
         */
        @NameInMap("PoolName")
        public java.util.List<String> poolName;

        /**
         * <p>The list of resource pool statuses to query.</p>
         */
        @NameInMap("Status")
        public java.util.List<String> status;

        /**
         * <p>Returns only resource pools created after the specified time. The time must be a Unix timestamp in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>1703819914</p>
         */
        @NameInMap("TimeCreatedAfter")
        public Integer timeCreatedAfter;

        /**
         * <p>Returns only resource pools created before the specified time. The time must be a Unix timestamp in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>1703820113</p>
         */
        @NameInMap("TimeCreatedBefore")
        public Integer timeCreatedBefore;

        public static ListPoolsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListPoolsRequestFilter self = new ListPoolsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListPoolsRequestFilter setPoolName(java.util.List<String> poolName) {
            this.poolName = poolName;
            return this;
        }
        public java.util.List<String> getPoolName() {
            return this.poolName;
        }

        public ListPoolsRequestFilter setStatus(java.util.List<String> status) {
            this.status = status;
            return this;
        }
        public java.util.List<String> getStatus() {
            return this.status;
        }

        public ListPoolsRequestFilter setTimeCreatedAfter(Integer timeCreatedAfter) {
            this.timeCreatedAfter = timeCreatedAfter;
            return this;
        }
        public Integer getTimeCreatedAfter() {
            return this.timeCreatedAfter;
        }

        public ListPoolsRequestFilter setTimeCreatedBefore(Integer timeCreatedBefore) {
            this.timeCreatedBefore = timeCreatedBefore;
            return this;
        }
        public Integer getTimeCreatedBefore() {
            return this.timeCreatedBefore;
        }

    }

}
