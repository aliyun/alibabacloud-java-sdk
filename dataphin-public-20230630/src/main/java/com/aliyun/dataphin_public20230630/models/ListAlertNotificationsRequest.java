// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAlertNotificationsRequest extends TeaModel {
    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListAlertNotificationsRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListAlertNotificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertNotificationsRequest self = new ListAlertNotificationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertNotificationsRequest setListQuery(ListAlertNotificationsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListAlertNotificationsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListAlertNotificationsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListAlertNotificationsRequestListQuery extends TeaModel {
        /**
         * <p>The list of alert reasons.</p>
         */
        @NameInMap("AlertReasonList")
        public java.util.List<String> alertReasonList;

        /**
         * <p>The list of push channel types.</p>
         */
        @NameInMap("ChannelTypeList")
        public java.util.List<String> channelTypeList;

        /**
         * <p>The list of custom message channel IDs.</p>
         */
        @NameInMap("CustomChannelIdList")
        public java.util.List<String> customChannelIdList;

        /**
         * <p>The keyword for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The list of monitored item IDs.</p>
         */
        @NameInMap("MonitoredItemIdList")
        public java.util.List<String> monitoredItemIdList;

        /**
         * <p>The end time of the push.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-27 13:47:00</p>
         */
        @NameInMap("NotifyEndTime")
        public String notifyEndTime;

        /**
         * <p>The start time of the push.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-16 00:00:00</p>
         */
        @NameInMap("NotifyStartTime")
        public String notifyStartTime;

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of records per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The source system. Valid values:</p>
         * <ul>
         * <li>ALL: all.</li>
         * <li>DQE: data quality.</li>
         * <li>OS: data service.</li>
         * <li>STREAM: real-time computing.</li>
         * <li>VDM_BATCH: offline computing.</li>
         * <li>SOP: O&amp;M platform.</li>
         * <li>REAL_TIME_PIPELINE: real-time integration.</li>
         * <li>KGB: baseline monitoring.</li>
         * </ul>
         * <p>And more.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("SourceSystem")
        public String sourceSystem;

        /**
         * <p>The list of push statuses.</p>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        /**
         * <p>The list of push recipient IDs.</p>
         */
        @NameInMap("UserIdList")
        public java.util.List<String> userIdList;

        public static ListAlertNotificationsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsRequestListQuery self = new ListAlertNotificationsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsRequestListQuery setAlertReasonList(java.util.List<String> alertReasonList) {
            this.alertReasonList = alertReasonList;
            return this;
        }
        public java.util.List<String> getAlertReasonList() {
            return this.alertReasonList;
        }

        public ListAlertNotificationsRequestListQuery setChannelTypeList(java.util.List<String> channelTypeList) {
            this.channelTypeList = channelTypeList;
            return this;
        }
        public java.util.List<String> getChannelTypeList() {
            return this.channelTypeList;
        }

        public ListAlertNotificationsRequestListQuery setCustomChannelIdList(java.util.List<String> customChannelIdList) {
            this.customChannelIdList = customChannelIdList;
            return this;
        }
        public java.util.List<String> getCustomChannelIdList() {
            return this.customChannelIdList;
        }

        public ListAlertNotificationsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListAlertNotificationsRequestListQuery setMonitoredItemIdList(java.util.List<String> monitoredItemIdList) {
            this.monitoredItemIdList = monitoredItemIdList;
            return this;
        }
        public java.util.List<String> getMonitoredItemIdList() {
            return this.monitoredItemIdList;
        }

        public ListAlertNotificationsRequestListQuery setNotifyEndTime(String notifyEndTime) {
            this.notifyEndTime = notifyEndTime;
            return this;
        }
        public String getNotifyEndTime() {
            return this.notifyEndTime;
        }

        public ListAlertNotificationsRequestListQuery setNotifyStartTime(String notifyStartTime) {
            this.notifyStartTime = notifyStartTime;
            return this;
        }
        public String getNotifyStartTime() {
            return this.notifyStartTime;
        }

        public ListAlertNotificationsRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListAlertNotificationsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAlertNotificationsRequestListQuery setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public ListAlertNotificationsRequestListQuery setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public ListAlertNotificationsRequestListQuery setUserIdList(java.util.List<String> userIdList) {
            this.userIdList = userIdList;
            return this;
        }
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

    }

}
