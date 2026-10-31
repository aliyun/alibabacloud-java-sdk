// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiCallStatisticsRequest extends TeaModel {
    /**
     * <p>The search conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListDataServiceApiCallStatisticsRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The data service project ID.</p>
     * <blockquote>
     * <p>If this parameter is not specified:</p>
     * <ul>
     * <li>Super administrators can query data of all service projects.</li>
     * <li>Users other than super administrators can query data of service projects where they have the service project administrator or O&amp;M user permissions.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static ListDataServiceApiCallStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiCallStatisticsRequest self = new ListDataServiceApiCallStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiCallStatisticsRequest setListQuery(ListDataServiceApiCallStatisticsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListDataServiceApiCallStatisticsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListDataServiceApiCallStatisticsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDataServiceApiCallStatisticsRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ListDataServiceApiCallStatisticsRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class ListDataServiceApiCallStatisticsRequestListQuery extends TeaModel {
        /**
         * <p>The end time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 20:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The column by which to sort the results. Valid values:</p>
         * <ul>
         * <li>CALL_COUNT: the number of calls.</li>
         * <li>ERROR_COUNT: the number of exceptions.</li>
         * <li>ERROR_RATE: the error rate.</li>
         * <li>AVG_RESPONSE_TIME: the average response time.</li>
         * <li>OFFLINE_RATE: the offline percentage.
         * Default value: CALL_COUNT.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CALL_COUNT</p>
         */
        @NameInMap("OrderColumn")
        public String orderColumn;

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li>1: ascending order.</li>
         * <li>2: descending order.
         * Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderType")
        public Integer orderType;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The start time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListDataServiceApiCallStatisticsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiCallStatisticsRequestListQuery self = new ListDataServiceApiCallStatisticsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiCallStatisticsRequestListQuery setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDataServiceApiCallStatisticsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListDataServiceApiCallStatisticsRequestListQuery setOrderColumn(String orderColumn) {
            this.orderColumn = orderColumn;
            return this;
        }
        public String getOrderColumn() {
            return this.orderColumn;
        }

        public ListDataServiceApiCallStatisticsRequestListQuery setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public ListDataServiceApiCallStatisticsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDataServiceApiCallStatisticsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceApiCallStatisticsRequestListQuery setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
