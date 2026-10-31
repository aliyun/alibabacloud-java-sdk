// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateScheduleMonitorRequest extends TeaModel {
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
     * <p>The request body for updating scheduling monitoring.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateScheduleMonitorRequestUpdateCommand updateCommand;

    public static UpdateScheduleMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleMonitorRequest self = new UpdateScheduleMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleMonitorRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateScheduleMonitorRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateScheduleMonitorRequest setUpdateCommand(UpdateScheduleMonitorRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateScheduleMonitorRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList extends TeaModel {
        /**
         * <p>The filter key.</p>
         * 
         * <strong>example:</strong>
         * <p>NODE_NAME</p>
         */
        @NameInMap("FilterKey")
        public String filterKey;

        /**
         * <p>The list of filter values. Multiple values are supported.</p>
         */
        @NameInMap("FilterValueList")
        public java.util.List<String> filterValueList;

        /**
         * <p>Specifies whether to exclude the selection.</p>
         */
        @NameInMap("IsExclude")
        public Boolean isExclude;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList setFilterValueList(java.util.List<String> filterValueList) {
            this.filterValueList = filterValueList;
            return this;
        }
        public java.util.List<String> getFilterValueList() {
            return this.filterValueList;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList setIsExclude(Boolean isExclude) {
            this.isExclude = isExclude;
            return this;
        }
        public Boolean getIsExclude() {
            return this.isExclude;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRange extends TeaModel {
        /**
         * <p>The list of filter rules. If left empty, all rules are applied by default.</p>
         */
        @NameInMap("FilterRuleList")
        public java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList> filterRuleList;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRange build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRange self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRange();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRange setFilterRuleList(java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList> filterRuleList) {
            this.filterRuleList = filterRuleList;
            return this;
        }
        public java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList> getFilterRuleList() {
            return this.filterRuleList;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig extends TeaModel {
        /**
         * <p>The business unit ID. Required when the summary logical table does not have a project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The logical table ID. Required for the LOGICAL_FIELD and LOGICAL_TABLE_NODE types.</p>
         * 
         * <strong>example:</strong>
         * <p>6812345678901234</p>
         */
        @NameInMap("LogicalTableId")
        public Long logicalTableId;

        /**
         * <p>The name of the logical table.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_order_detail</p>
         */
        @NameInMap("LogicalTableName")
        public String logicalTableName;

        /**
         * <p>The monitored object type. Valid values: LOGICAL_FIELD (logical field), OND_ID_NODE (logical table node), SCHEDULE_PHYSICAL_NODE (periodically scheduled physical task), MANUAL_PHYSICAL_NODE (manually scheduled physical task), ODM_NODE (source path task), LOGICAL_TABLE_NODE (logical table task), and PROJECT (project).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCHEDULE_PHYSICAL_NODE</p>
         */
        @NameInMap("MonitoredItemType")
        public String monitoredItemType;

        /**
         * <p>The monitored task scope, which specifies project-level monitoring filter rules. Required for the PROJECT type.</p>
         */
        @NameInMap("MonitoredNodeRange")
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRange monitoredNodeRange;

        /**
         * <p>The monitored task ID, which is the node ID. Required for types other than PROJECT.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The monitored task name, which is the node name. Required for types other than PROJECT.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_order_detail_daily</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The node subtype. Required for types other than PROJECT and LOGICAL_FIELD.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE_SQL</p>
         */
        @NameInMap("NodeSubType")
        public String nodeSubType;

        /**
         * <p>The list of node O&amp;M owner IDs. This serves as the source for OWNER recipients.</p>
         */
        @NameInMap("OpsOwnerIdList")
        public java.util.List<String> opsOwnerIdList;

        /**
         * <p>The project ID. Required for the PROJECT type. For other types, it specifies the project to which the monitored object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>7086194564164288</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig setLogicalTableId(Long logicalTableId) {
            this.logicalTableId = logicalTableId;
            return this;
        }
        public Long getLogicalTableId() {
            return this.logicalTableId;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig setLogicalTableName(String logicalTableName) {
            this.logicalTableName = logicalTableName;
            return this;
        }
        public String getLogicalTableName() {
            return this.logicalTableName;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig setMonitoredItemType(String monitoredItemType) {
            this.monitoredItemType = monitoredItemType;
            return this;
        }
        public String getMonitoredItemType() {
            return this.monitoredItemType;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig setMonitoredNodeRange(UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRange monitoredNodeRange) {
            this.monitoredNodeRange = monitoredNodeRange;
            return this;
        }
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfigMonitoredNodeRange getMonitoredNodeRange() {
            return this.monitoredNodeRange;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig setNodeSubType(String nodeSubType) {
            this.nodeSubType = nodeSubType;
            return this;
        }
        public String getNodeSubType() {
            return this.nodeSubType;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig setOpsOwnerIdList(java.util.List<String> opsOwnerIdList) {
            this.opsOwnerIdList = opsOwnerIdList;
            return this;
        }
        public java.util.List<String> getOpsOwnerIdList() {
            return this.opsOwnerIdList;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange extends TeaModel {
        /**
         * <p>The end time in HH:mm format. Set this parameter to 0 to indicate no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>11:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time in HH:mm format. Set this parameter to 0 to indicate no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList extends TeaModel {
        /**
         * <p>The list of custom alert channel IDs.</p>
         */
        @NameInMap("CustomAlertChannelIdList")
        public java.util.List<String> customAlertChannelIdList;

        /**
         * <p>The list of on-duty table IDs. This parameter is required when ReceiverType is set to ON_DUTY_TABLE.</p>
         */
        @NameInMap("OnDutyTableIdList")
        public java.util.List<String> onDutyTableIdList;

        /**
         * <p>The list of receiving methods. Valid values: PHONE: Phone call. MESSAGE: Text message. EMAIL: Email. DING_TALK: DingTalk. FEISHU: Lark. WECHAT: WeChat. CUSTOM: Custom channel.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ReceivedWayList")
        public java.util.List<String> receivedWayList;

        /**
         * <p>The recipient type. Valid values: OWNER: Owner. USER_CUSTOM: Custom user. ON_DUTY_TABLE: On-duty table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The list of recipient user IDs. This parameter is required when ReceiverType is set to USER_CUSTOM.</p>
         */
        @NameInMap("ReceiverUserIdList")
        public java.util.List<String> receiverUserIdList;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList setCustomAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
            this.customAlertChannelIdList = customAlertChannelIdList;
            return this;
        }
        public java.util.List<String> getCustomAlertChannelIdList() {
            return this.customAlertChannelIdList;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList setOnDutyTableIdList(java.util.List<String> onDutyTableIdList) {
            this.onDutyTableIdList = onDutyTableIdList;
            return this;
        }
        public java.util.List<String> getOnDutyTableIdList() {
            return this.onDutyTableIdList;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList setReceivedWayList(java.util.List<String> receivedWayList) {
            this.receivedWayList = receivedWayList;
            return this;
        }
        public java.util.List<String> getReceivedWayList() {
            return this.receivedWayList;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList setReceiverUserIdList(java.util.List<String> receiverUserIdList) {
            this.receiverUserIdList = receiverUserIdList;
            return this;
        }
        public java.util.List<String> getReceiverUserIdList() {
            return this.receiverUserIdList;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy extends TeaModel {
        /**
         * <p>The alert trigger frequency.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertFrequency")
        public Integer alertFrequency;

        /**
         * <p>The monitored time range.</p>
         */
        @NameInMap("MonitoredTimeRange")
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange monitoredTimeRange;

        /**
         * <p>The list of recipient configurations.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ReceiverConfigList")
        public java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList> receiverConfigList;

        /**
         * <p>The maximum number of times an alert can be sent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SendTimes")
        public Integer sendTimes;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy setAlertFrequency(Integer alertFrequency) {
            this.alertFrequency = alertFrequency;
            return this;
        }
        public Integer getAlertFrequency() {
            return this.alertFrequency;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy setMonitoredTimeRange(UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange monitoredTimeRange) {
            this.monitoredTimeRange = monitoredTimeRange;
            return this;
        }
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange getMonitoredTimeRange() {
            return this.monitoredTimeRange;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy setReceiverConfigList(java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList> receiverConfigList) {
            this.receiverConfigList = receiverConfigList;
            return this;
        }
        public java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList> getReceiverConfigList() {
            return this.receiverConfigList;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy setSendTimes(Integer sendTimes) {
            this.sendTimes = sendTimes;
            return this;
        }
        public Integer getSendTimes() {
            return this.sendTimes;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig extends TeaModel {
        /**
         * <p>The daily check time for unfinished nodes in HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("FixedUnfinishedTime")
        public String fixedUnfinishedTime;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig setFixedUnfinishedTime(String fixedUnfinishedTime) {
            this.fixedUnfinishedTime = fixedUnfinishedTime;
            return this;
        }
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList extends TeaModel {
        /**
         * <p>The check time for unfinished nodes in HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("FixedUnfinishedTime")
        public String fixedUnfinishedTime;

        /**
         * <p>The number of periods.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodNum")
        public Integer periodNum;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList setFixedUnfinishedTime(String fixedUnfinishedTime) {
            this.fixedUnfinishedTime = fixedUnfinishedTime;
            return this;
        }
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList setPeriodNum(Integer periodNum) {
            this.periodNum = periodNum;
            return this;
        }
        public Integer getPeriodNum() {
            return this.periodNum;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig extends TeaModel {
        /**
         * <p>The list of custom monitoring periods. Specify this parameter when MonitorPeriodType is set to CUSTOM.</p>
         */
        @NameInMap("CustomPeriodList")
        public java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList> customPeriodList;

        /**
         * <p>The interval time value. This parameter is used together with IntervalUnit.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("IntervalAfterDueTime")
        public Integer intervalAfterDueTime;

        /**
         * <p>The interval unit. Valid values: SECONDS, MINUTES, and HOURS.</p>
         * 
         * <strong>example:</strong>
         * <p>MINUTES</p>
         */
        @NameInMap("IntervalUnit")
        public String intervalUnit;

        /**
         * <p>The monitoring period type. Valid values: ALL, FIRST, LAST, and CUSTOM.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("MonitorPeriodType")
        public String monitorPeriodType;

        /**
         * <p>The trigger rule type. Valid values: INTERVAL_AFTER_DUE_TIME: Triggered at an interval after the due time. FIX_TIME: Triggered at a fixed time.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERVAL_AFTER_DUE_TIME</p>
         */
        @NameInMap("TriggerRuleType")
        public String triggerRuleType;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setCustomPeriodList(java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList> customPeriodList) {
            this.customPeriodList = customPeriodList;
            return this;
        }
        public java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList> getCustomPeriodList() {
            return this.customPeriodList;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setIntervalAfterDueTime(Integer intervalAfterDueTime) {
            this.intervalAfterDueTime = intervalAfterDueTime;
            return this;
        }
        public Integer getIntervalAfterDueTime() {
            return this.intervalAfterDueTime;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setMonitorPeriodType(String monitorPeriodType) {
            this.monitorPeriodType = monitorPeriodType;
            return this;
        }
        public String getMonitorPeriodType() {
            return this.monitorPeriodType;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setTriggerRuleType(String triggerRuleType) {
            this.triggerRuleType = triggerRuleType;
            return this;
        }
        public String getTriggerRuleType() {
            return this.triggerRuleType;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig extends TeaModel {
        /**
         * <p>The daily unfinished configuration.</p>
         */
        @NameInMap("DailyUnfinishedConfig")
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig dailyUnfinishedConfig;

        /**
         * <p>The multi-period unfinished configuration.</p>
         */
        @NameInMap("MultiPeriodUnfinishedConfig")
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig setDailyUnfinishedConfig(UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig dailyUnfinishedConfig) {
            this.dailyUnfinishedConfig = dailyUnfinishedConfig;
            return this;
        }
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig getDailyUnfinishedConfig() {
            return this.dailyUnfinishedConfig;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig setMultiPeriodUnfinishedConfig(UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig) {
            this.multiPeriodUnfinishedConfig = multiPeriodUnfinishedConfig;
            return this;
        }
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig getMultiPeriodUnfinishedConfig() {
            return this.multiPeriodUnfinishedConfig;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList extends TeaModel {
        /**
         * <p>The alert cause type. Valid values: FAILED: The node fails to run. TIME_OUT: The node execution times out. UNFINISHED: The node does not generate data. SUCCESS: The node runs successfully. DATA_DELAY: Data is delayed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TIME_OUT</p>
         */
        @NameInMap("AlertReasonType")
        public String alertReasonType;

        /**
         * <p>The alert strategy.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AlertStrategy")
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy alertStrategy;

        /**
         * <p>The timeout period in minutes. Specify this parameter only when AlertReasonType is set to TIME_OUT.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("FixedElapsedTime")
        public Long fixedElapsedTime;

        /**
         * <p>The daily check time for unfinished nodes in HH:mm format. Specify this parameter only when AlertReasonType is set to UNFINISHED.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("FixedUnfinishedTime")
        public String fixedUnfinishedTime;

        /**
         * <p>The detailed configuration for the unfinished rule. Specify this parameter only when AlertReasonType is set to UNFINISHED.</p>
         */
        @NameInMap("UnfinishedRuleDetailConfig")
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig unfinishedRuleDetailConfig;

        public static UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList self = new UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList setAlertReasonType(String alertReasonType) {
            this.alertReasonType = alertReasonType;
            return this;
        }
        public String getAlertReasonType() {
            return this.alertReasonType;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList setAlertStrategy(UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy alertStrategy) {
            this.alertStrategy = alertStrategy;
            return this;
        }
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListAlertStrategy getAlertStrategy() {
            return this.alertStrategy;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList setFixedElapsedTime(Long fixedElapsedTime) {
            this.fixedElapsedTime = fixedElapsedTime;
            return this;
        }
        public Long getFixedElapsedTime() {
            return this.fixedElapsedTime;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList setFixedUnfinishedTime(String fixedUnfinishedTime) {
            this.fixedUnfinishedTime = fixedUnfinishedTime;
            return this;
        }
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList setUnfinishedRuleDetailConfig(UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig unfinishedRuleDetailConfig) {
            this.unfinishedRuleDetailConfig = unfinishedRuleDetailConfig;
            return this;
        }
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig getUnfinishedRuleDetailConfig() {
            return this.unfinishedRuleDetailConfig;
        }

    }

    public static class UpdateScheduleMonitorRequestUpdateCommand extends TeaModel {
        /**
         * <p>The monitored object configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("MonitoredItemConfig")
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig monitoredItemConfig;

        /**
         * <p>The monitored object ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6912345678901234</p>
         */
        @NameInMap("MonitoredItemId")
        public Long monitoredItemId;

        /**
         * <p>The list of monitored rule configurations. You can configure multiple rules with different alert causes.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("MonitoredRuleConfigList")
        public java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList> monitoredRuleConfigList;

        public static UpdateScheduleMonitorRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleMonitorRequestUpdateCommand self = new UpdateScheduleMonitorRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleMonitorRequestUpdateCommand setMonitoredItemConfig(UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig monitoredItemConfig) {
            this.monitoredItemConfig = monitoredItemConfig;
            return this;
        }
        public UpdateScheduleMonitorRequestUpdateCommandMonitoredItemConfig getMonitoredItemConfig() {
            return this.monitoredItemConfig;
        }

        public UpdateScheduleMonitorRequestUpdateCommand setMonitoredItemId(Long monitoredItemId) {
            this.monitoredItemId = monitoredItemId;
            return this;
        }
        public Long getMonitoredItemId() {
            return this.monitoredItemId;
        }

        public UpdateScheduleMonitorRequestUpdateCommand setMonitoredRuleConfigList(java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList> monitoredRuleConfigList) {
            this.monitoredRuleConfigList = monitoredRuleConfigList;
            return this;
        }
        public java.util.List<UpdateScheduleMonitorRequestUpdateCommandMonitoredRuleConfigList> getMonitoredRuleConfigList() {
            return this.monitoredRuleConfigList;
        }

    }

}
