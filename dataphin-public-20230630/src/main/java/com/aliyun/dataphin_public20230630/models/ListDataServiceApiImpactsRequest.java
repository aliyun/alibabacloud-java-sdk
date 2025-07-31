// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiImpactsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListDataServiceApiImpactsRequestListQuery listQuery;

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

    public static ListDataServiceApiImpactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiImpactsRequest self = new ListDataServiceApiImpactsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiImpactsRequest setListQuery(ListDataServiceApiImpactsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListDataServiceApiImpactsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListDataServiceApiImpactsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDataServiceApiImpactsRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class ListDataServiceApiImpactsRequestListQuery extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

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

        public static ListDataServiceApiImpactsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiImpactsRequestListQuery self = new ListDataServiceApiImpactsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiImpactsRequestListQuery setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApiImpactsRequestListQuery setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDataServiceApiImpactsRequestListQuery setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDataServiceApiImpactsRequestListQuery setOrderColumn(String orderColumn) {
            this.orderColumn = orderColumn;
            return this;
        }
        public String getOrderColumn() {
            return this.orderColumn;
        }

        public ListDataServiceApiImpactsRequestListQuery setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public ListDataServiceApiImpactsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDataServiceApiImpactsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceApiImpactsRequestListQuery setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
