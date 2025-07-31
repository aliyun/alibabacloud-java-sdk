// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiCallStatisticsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListDataServiceApiCallStatisticsRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
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

    public ListDataServiceApiCallStatisticsRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class ListDataServiceApiCallStatisticsRequestListQuery extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 20:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>CALL_COUNT</p>
         */
        @NameInMap("OrderColumn")
        public String orderColumn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderType")
        public Integer orderType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
