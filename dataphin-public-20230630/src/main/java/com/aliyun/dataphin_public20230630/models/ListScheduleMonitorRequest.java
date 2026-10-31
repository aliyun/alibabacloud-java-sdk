// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListScheduleMonitorRequest extends TeaModel {
    /**
     * <p>The query conditions for scheduling monitoring and alerting.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListScheduleMonitorRequestListQuery listQuery;

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
     * <p>The user ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListScheduleMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleMonitorRequest self = new ListScheduleMonitorRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduleMonitorRequest setListQuery(ListScheduleMonitorRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListScheduleMonitorRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListScheduleMonitorRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListScheduleMonitorRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListScheduleMonitorRequestListQuery extends TeaModel {
        /**
         * <p>The list of alert cause types. Valid values: FAILED (the task execution failed), TIME_OUT (the task execution timed out), UNFINISHED (the task did not generate output), SUCCESS (the task execution succeeded), and DATA_DELAY (the data is delayed).</p>
         */
        @NameInMap("AlertReasonList")
        public java.util.List<String> alertReasonList;

        /**
         * <p>The keyword for search. Supports fuzzy matching for monitored task names. If this parameter is empty or not specified, no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_order_detail</p>
         */
        @NameInMap("KeyWord")
        public String keyWord;

        /**
         * <p>The list of logical field IDs.</p>
         */
        @NameInMap("LogicFieldIdList")
        public java.util.List<Long> logicFieldIdList;

        /**
         * <p>The list of logical table IDs.</p>
         */
        @NameInMap("LogicalTableIdList")
        public java.util.List<Long> logicalTableIdList;

        /**
         * <p>The list of on-call schedule IDs.</p>
         */
        @NameInMap("OnCallTableList")
        public java.util.List<String> onCallTableList;

        /**
         * <p>The list of user IDs of the creators of monitored objects.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<String> ownerList;

        /**
         * <p>The current page number. Pages start from 1. Default value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of project IDs. If this parameter is empty, all projects that the current user has permissions on are automatically queried.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The list of notification method types. Valid values: PHONE (phone call), MESSAGE (text message), EMAIL (email), DING_TALK (DingTalk), FEISHU (Lark), WECHAT (WeChat), and CUSTOM (custom channel).</p>
         */
        @NameInMap("ReceivedWayTypeList")
        public java.util.List<String> receivedWayTypeList;

        /**
         * <p>The list of user IDs of the recipients.</p>
         */
        @NameInMap("ReceiverList")
        public java.util.List<String> receiverList;

        /**
         * <p>The list of monitored object types. Valid values: LOGICAL_FIELD (logical field), OND_ID_NODE (logical table node), SCHEDULE_PHYSICAL_NODE (periodically scheduled physical task), MANUAL_PHYSICAL_NODE (manually scheduled physical task), ODM_NODE (source path task), LOGICAL_TABLE_NODE (logical table task), and PROJECT (project).</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("TypeList")
        public java.util.List<String> typeList;

        public static ListScheduleMonitorRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorRequestListQuery self = new ListScheduleMonitorRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorRequestListQuery setAlertReasonList(java.util.List<String> alertReasonList) {
            this.alertReasonList = alertReasonList;
            return this;
        }
        public java.util.List<String> getAlertReasonList() {
            return this.alertReasonList;
        }

        public ListScheduleMonitorRequestListQuery setKeyWord(String keyWord) {
            this.keyWord = keyWord;
            return this;
        }
        public String getKeyWord() {
            return this.keyWord;
        }

        public ListScheduleMonitorRequestListQuery setLogicFieldIdList(java.util.List<Long> logicFieldIdList) {
            this.logicFieldIdList = logicFieldIdList;
            return this;
        }
        public java.util.List<Long> getLogicFieldIdList() {
            return this.logicFieldIdList;
        }

        public ListScheduleMonitorRequestListQuery setLogicalTableIdList(java.util.List<Long> logicalTableIdList) {
            this.logicalTableIdList = logicalTableIdList;
            return this;
        }
        public java.util.List<Long> getLogicalTableIdList() {
            return this.logicalTableIdList;
        }

        public ListScheduleMonitorRequestListQuery setOnCallTableList(java.util.List<String> onCallTableList) {
            this.onCallTableList = onCallTableList;
            return this;
        }
        public java.util.List<String> getOnCallTableList() {
            return this.onCallTableList;
        }

        public ListScheduleMonitorRequestListQuery setOwnerList(java.util.List<String> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<String> getOwnerList() {
            return this.ownerList;
        }

        public ListScheduleMonitorRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListScheduleMonitorRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListScheduleMonitorRequestListQuery setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public ListScheduleMonitorRequestListQuery setReceivedWayTypeList(java.util.List<String> receivedWayTypeList) {
            this.receivedWayTypeList = receivedWayTypeList;
            return this;
        }
        public java.util.List<String> getReceivedWayTypeList() {
            return this.receivedWayTypeList;
        }

        public ListScheduleMonitorRequestListQuery setReceiverList(java.util.List<String> receiverList) {
            this.receiverList = receiverList;
            return this;
        }
        public java.util.List<String> getReceiverList() {
            return this.receiverList;
        }

        public ListScheduleMonitorRequestListQuery setTypeList(java.util.List<String> typeList) {
            this.typeList = typeList;
            return this;
        }
        public java.util.List<String> getTypeList() {
            return this.typeList;
        }

    }

}
