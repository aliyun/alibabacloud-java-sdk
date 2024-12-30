// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAlertEventsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListAlertEventsRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListAlertEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertEventsRequest self = new ListAlertEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertEventsRequest setListQuery(ListAlertEventsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListAlertEventsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListAlertEventsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListAlertEventsRequestListQuery extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-27 13:47:00</p>
         */
        @NameInMap("AlertEndTime")
        public String alertEndTime;

        @NameInMap("AlertObjectTypeList")
        public java.util.List<String> alertObjectTypeList;

        @NameInMap("AlertReasonList")
        public java.util.List<String> alertReasonList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-16 00:00:00</p>
         */
        @NameInMap("AlertStartTime")
        public String alertStartTime;

        @NameInMap("BizNameList")
        public java.util.List<String> bizNameList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        @NameInMap("MonitoredItemIdList")
        public java.util.List<String> monitoredItemIdList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ProjectNameList")
        public java.util.List<String> projectNameList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        @NameInMap("UserIdList")
        public java.util.List<String> userIdList;

        public static ListAlertEventsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsRequestListQuery self = new ListAlertEventsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsRequestListQuery setAlertEndTime(String alertEndTime) {
            this.alertEndTime = alertEndTime;
            return this;
        }
        public String getAlertEndTime() {
            return this.alertEndTime;
        }

        public ListAlertEventsRequestListQuery setAlertObjectTypeList(java.util.List<String> alertObjectTypeList) {
            this.alertObjectTypeList = alertObjectTypeList;
            return this;
        }
        public java.util.List<String> getAlertObjectTypeList() {
            return this.alertObjectTypeList;
        }

        public ListAlertEventsRequestListQuery setAlertReasonList(java.util.List<String> alertReasonList) {
            this.alertReasonList = alertReasonList;
            return this;
        }
        public java.util.List<String> getAlertReasonList() {
            return this.alertReasonList;
        }

        public ListAlertEventsRequestListQuery setAlertStartTime(String alertStartTime) {
            this.alertStartTime = alertStartTime;
            return this;
        }
        public String getAlertStartTime() {
            return this.alertStartTime;
        }

        public ListAlertEventsRequestListQuery setBizNameList(java.util.List<String> bizNameList) {
            this.bizNameList = bizNameList;
            return this;
        }
        public java.util.List<String> getBizNameList() {
            return this.bizNameList;
        }

        public ListAlertEventsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListAlertEventsRequestListQuery setMonitoredItemIdList(java.util.List<String> monitoredItemIdList) {
            this.monitoredItemIdList = monitoredItemIdList;
            return this;
        }
        public java.util.List<String> getMonitoredItemIdList() {
            return this.monitoredItemIdList;
        }

        public ListAlertEventsRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListAlertEventsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAlertEventsRequestListQuery setProjectNameList(java.util.List<String> projectNameList) {
            this.projectNameList = projectNameList;
            return this;
        }
        public java.util.List<String> getProjectNameList() {
            return this.projectNameList;
        }

        public ListAlertEventsRequestListQuery setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public ListAlertEventsRequestListQuery setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public ListAlertEventsRequestListQuery setUserIdList(java.util.List<String> userIdList) {
            this.userIdList = userIdList;
            return this;
        }
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

    }

}
