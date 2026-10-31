// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateScheduleMonitorRequest extends TeaModel {
    /**
     * <p>The request body for creating a scheduling monitoring configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateScheduleMonitorRequestCreateCommand createCommand;

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
     * <p>The operator user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CreateScheduleMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleMonitorRequest self = new CreateScheduleMonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleMonitorRequest setCreateCommand(CreateScheduleMonitorRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateScheduleMonitorRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateScheduleMonitorRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateScheduleMonitorRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList extends TeaModel {
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
         * <p>Specifies whether to invert the selection.</p>
         */
        @NameInMap("IsExclude")
        public Boolean isExclude;

        public static CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList self = new CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList setFilterValueList(java.util.List<String> filterValueList) {
            this.filterValueList = filterValueList;
            return this;
        }
        public java.util.List<String> getFilterValueList() {
            return this.filterValueList;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList setIsExclude(Boolean isExclude) {
            this.isExclude = isExclude;
            return this;
        }
        public Boolean getIsExclude() {
            return this.isExclude;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRange extends TeaModel {
        /**
         * <p>The list of filter rules. If this parameter is left empty, all tasks are monitored by default.</p>
         */
        @NameInMap("FilterRuleList")
        public java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList> filterRuleList;

        public static CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRange build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRange self = new CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRange();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRange setFilterRuleList(java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList> filterRuleList) {
            this.filterRuleList = filterRuleList;
            return this;
        }
        public java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRangeFilterRuleList> getFilterRuleList() {
            return this.filterRuleList;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig extends TeaModel {
        /**
         * <p>The business unit ID. Specify this parameter when the summary logical table does not have a project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The logical table ID. Specify this parameter when the monitored object type is LOGICAL_FIELD or LOGICAL_TABLE_NODE.</p>
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
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>LOGICAL_FIELD: logical field.</li>
         * <li>OND_ID_NODE: logical table node.</li>
         * <li>SCHEDULE_PHYSICAL_NODE: physical task with epoch scheduling.</li>
         * <li>MANUAL_PHYSICAL_NODE: physical task with manual scheduling.</li>
         * <li>ODM_NODE: source data path task.</li>
         * <li>LOGICAL_TABLE_NODE: logical table task.</li>
         * <li>PROJECT: project.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCHEDULE_PHYSICAL_NODE</p>
         */
        @NameInMap("MonitoredItemType")
        public String monitoredItemType;

        /**
         * <p>The scope of monitored tasks, which serves as the filtering rule for project-level monitoring. Specify this parameter when the monitored object type is PROJECT.</p>
         */
        @NameInMap("MonitoredNodeRange")
        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRange monitoredNodeRange;

        /**
         * <p>The ID of the monitored task, which is the node ID. This parameter is required when the monitored object type is not PROJECT.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the monitored task, which is the node name. This parameter is required when the monitored object type is not PROJECT.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_order_detail_daily</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The subtype of the node. This parameter is required when the monitored object type is not PROJECT or LOGICAL_FIELD.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE_SQL</p>
         */
        @NameInMap("NodeSubType")
        public String nodeSubType;

        /**
         * <p>The list of O&amp;M owner IDs for the node. This serves as the source for the OWNER recipient type.</p>
         */
        @NameInMap("OpsOwnerIdList")
        public java.util.List<String> opsOwnerIdList;

        /**
         * <p>The project ID. This parameter is required when the monitored object type is PROJECT. For other types, it specifies the project to which the monitored object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>7086194564164288</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig self = new CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig setLogicalTableId(Long logicalTableId) {
            this.logicalTableId = logicalTableId;
            return this;
        }
        public Long getLogicalTableId() {
            return this.logicalTableId;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig setLogicalTableName(String logicalTableName) {
            this.logicalTableName = logicalTableName;
            return this;
        }
        public String getLogicalTableName() {
            return this.logicalTableName;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig setMonitoredItemType(String monitoredItemType) {
            this.monitoredItemType = monitoredItemType;
            return this;
        }
        public String getMonitoredItemType() {
            return this.monitoredItemType;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig setMonitoredNodeRange(CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRange monitoredNodeRange) {
            this.monitoredNodeRange = monitoredNodeRange;
            return this;
        }
        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfigMonitoredNodeRange getMonitoredNodeRange() {
            return this.monitoredNodeRange;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig setNodeSubType(String nodeSubType) {
            this.nodeSubType = nodeSubType;
            return this;
        }
        public String getNodeSubType() {
            return this.nodeSubType;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig setOpsOwnerIdList(java.util.List<String> opsOwnerIdList) {
            this.opsOwnerIdList = opsOwnerIdList;
            return this;
        }
        public java.util.List<String> getOpsOwnerIdList() {
            return this.opsOwnerIdList;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange extends TeaModel {
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

        public static CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange self = new CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList extends TeaModel {
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
         * <p>The list of notification methods. Valid values:</p>
         * <ul>
         * <li>PHONE: Phone call.</li>
         * <li>MESSAGE: Text message.</li>
         * <li>EMAIL: Email.</li>
         * <li>DING_TALK: DingTalk.</li>
         * <li>FEISHU: Lark.</li>
         * <li>WECHAT: WeChat.</li>
         * <li>CUSTOM: Custom channel.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ReceivedWayList")
        public java.util.List<String> receivedWayList;

        /**
         * <p>The recipient type. Valid values:</p>
         * <ul>
         * <li>OWNER: The owner.</li>
         * <li>USER_CUSTOM: A custom user.</li>
         * <li>ON_DUTY_TABLE: An on-duty table.</li>
         * </ul>
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

        public static CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList self = new CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList setCustomAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
            this.customAlertChannelIdList = customAlertChannelIdList;
            return this;
        }
        public java.util.List<String> getCustomAlertChannelIdList() {
            return this.customAlertChannelIdList;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList setOnDutyTableIdList(java.util.List<String> onDutyTableIdList) {
            this.onDutyTableIdList = onDutyTableIdList;
            return this;
        }
        public java.util.List<String> getOnDutyTableIdList() {
            return this.onDutyTableIdList;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList setReceivedWayList(java.util.List<String> receivedWayList) {
            this.receivedWayList = receivedWayList;
            return this;
        }
        public java.util.List<String> getReceivedWayList() {
            return this.receivedWayList;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList setReceiverUserIdList(java.util.List<String> receiverUserIdList) {
            this.receiverUserIdList = receiverUserIdList;
            return this;
        }
        public java.util.List<String> getReceiverUserIdList() {
            return this.receiverUserIdList;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy extends TeaModel {
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
        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange monitoredTimeRange;

        /**
         * <p>The list of recipient configurations.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ReceiverConfigList")
        public java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList> receiverConfigList;

        /**
         * <p>The maximum number of alert notifications to send.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SendTimes")
        public Integer sendTimes;

        public static CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy self = new CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy setAlertFrequency(Integer alertFrequency) {
            this.alertFrequency = alertFrequency;
            return this;
        }
        public Integer getAlertFrequency() {
            return this.alertFrequency;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy setMonitoredTimeRange(CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange monitoredTimeRange) {
            this.monitoredTimeRange = monitoredTimeRange;
            return this;
        }
        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyMonitoredTimeRange getMonitoredTimeRange() {
            return this.monitoredTimeRange;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy setReceiverConfigList(java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList> receiverConfigList) {
            this.receiverConfigList = receiverConfigList;
            return this;
        }
        public java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategyReceiverConfigList> getReceiverConfigList() {
            return this.receiverConfigList;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy setSendTimes(Integer sendTimes) {
            this.sendTimes = sendTimes;
            return this;
        }
        public Integer getSendTimes() {
            return this.sendTimes;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig extends TeaModel {
        /**
         * <p>The daily time to check for unfinished tasks in HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("FixedUnfinishedTime")
        public String fixedUnfinishedTime;

        public static CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig self = new CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig setFixedUnfinishedTime(String fixedUnfinishedTime) {
            this.fixedUnfinishedTime = fixedUnfinishedTime;
            return this;
        }
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList extends TeaModel {
        /**
         * <p>The time to check for unfinished tasks in HH:mm format.</p>
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

        public static CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList self = new CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList setFixedUnfinishedTime(String fixedUnfinishedTime) {
            this.fixedUnfinishedTime = fixedUnfinishedTime;
            return this;
        }
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList setPeriodNum(Integer periodNum) {
            this.periodNum = periodNum;
            return this;
        }
        public Integer getPeriodNum() {
            return this.periodNum;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig extends TeaModel {
        /**
         * <p>The list of custom monitoring periods. Specify this parameter when MonitorPeriodType is set to CUSTOM.</p>
         */
        @NameInMap("CustomPeriodList")
        public java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList> customPeriodList;

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
         * <p>The trigger rule type. Valid values:</p>
         * <ul>
         * <li>INTERVAL_AFTER_DUE_TIME: Triggered at an interval after the due time.</li>
         * <li>FIX_TIME: Triggered at a fixed time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERVAL_AFTER_DUE_TIME</p>
         */
        @NameInMap("TriggerRuleType")
        public String triggerRuleType;

        public static CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig self = new CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setCustomPeriodList(java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList> customPeriodList) {
            this.customPeriodList = customPeriodList;
            return this;
        }
        public java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList> getCustomPeriodList() {
            return this.customPeriodList;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setIntervalAfterDueTime(Integer intervalAfterDueTime) {
            this.intervalAfterDueTime = intervalAfterDueTime;
            return this;
        }
        public Integer getIntervalAfterDueTime() {
            return this.intervalAfterDueTime;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setMonitorPeriodType(String monitorPeriodType) {
            this.monitorPeriodType = monitorPeriodType;
            return this;
        }
        public String getMonitorPeriodType() {
            return this.monitorPeriodType;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setTriggerRuleType(String triggerRuleType) {
            this.triggerRuleType = triggerRuleType;
            return this;
        }
        public String getTriggerRuleType() {
            return this.triggerRuleType;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig extends TeaModel {
        /**
         * <p>The daily unfinished configuration.</p>
         */
        @NameInMap("DailyUnfinishedConfig")
        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig dailyUnfinishedConfig;

        /**
         * <p>The multi-period unfinished configuration.</p>
         */
        @NameInMap("MultiPeriodUnfinishedConfig")
        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig;

        public static CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig self = new CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig setDailyUnfinishedConfig(CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig dailyUnfinishedConfig) {
            this.dailyUnfinishedConfig = dailyUnfinishedConfig;
            return this;
        }
        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigDailyUnfinishedConfig getDailyUnfinishedConfig() {
            return this.dailyUnfinishedConfig;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig setMultiPeriodUnfinishedConfig(CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig) {
            this.multiPeriodUnfinishedConfig = multiPeriodUnfinishedConfig;
            return this;
        }
        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig getMultiPeriodUnfinishedConfig() {
            return this.multiPeriodUnfinishedConfig;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList extends TeaModel {
        /**
         * <p>The alert cause type. Valid values:</p>
         * <ul>
         * <li>FAILED: The task execution failed.</li>
         * <li>TIME_OUT: The task execution timed out.</li>
         * <li>UNFINISHED: The task is not completed.</li>
         * <li>SUCCESS: The task execution succeeded.</li>
         * <li>DATA_DELAY: The data is delayed.</li>
         * </ul>
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
        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy alertStrategy;

        /**
         * <p>The timeout period in minutes. Specify this parameter only when AlertReasonType is set to TIME_OUT.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("FixedElapsedTime")
        public Long fixedElapsedTime;

        /**
         * <p>The daily time to check for unfinished tasks in HH:mm format. Specify this parameter only when AlertReasonType is set to UNFINISHED.</p>
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
        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig unfinishedRuleDetailConfig;

        public static CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList self = new CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList setAlertReasonType(String alertReasonType) {
            this.alertReasonType = alertReasonType;
            return this;
        }
        public String getAlertReasonType() {
            return this.alertReasonType;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList setAlertStrategy(CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy alertStrategy) {
            this.alertStrategy = alertStrategy;
            return this;
        }
        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListAlertStrategy getAlertStrategy() {
            return this.alertStrategy;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList setFixedElapsedTime(Long fixedElapsedTime) {
            this.fixedElapsedTime = fixedElapsedTime;
            return this;
        }
        public Long getFixedElapsedTime() {
            return this.fixedElapsedTime;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList setFixedUnfinishedTime(String fixedUnfinishedTime) {
            this.fixedUnfinishedTime = fixedUnfinishedTime;
            return this;
        }
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList setUnfinishedRuleDetailConfig(CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig unfinishedRuleDetailConfig) {
            this.unfinishedRuleDetailConfig = unfinishedRuleDetailConfig;
            return this;
        }
        public CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigListUnfinishedRuleDetailConfig getUnfinishedRuleDetailConfig() {
            return this.unfinishedRuleDetailConfig;
        }

    }

    public static class CreateScheduleMonitorRequestCreateCommand extends TeaModel {
        /**
         * <p>The monitored object configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("MonitoredItemConfig")
        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig monitoredItemConfig;

        /**
         * <p>The list of monitoring rule configurations. You can configure multiple rules for different alert causes.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("MonitoredRuleConfigList")
        public java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList> monitoredRuleConfigList;

        public static CreateScheduleMonitorRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorRequestCreateCommand self = new CreateScheduleMonitorRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorRequestCreateCommand setMonitoredItemConfig(CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig monitoredItemConfig) {
            this.monitoredItemConfig = monitoredItemConfig;
            return this;
        }
        public CreateScheduleMonitorRequestCreateCommandMonitoredItemConfig getMonitoredItemConfig() {
            return this.monitoredItemConfig;
        }

        public CreateScheduleMonitorRequestCreateCommand setMonitoredRuleConfigList(java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList> monitoredRuleConfigList) {
            this.monitoredRuleConfigList = monitoredRuleConfigList;
            return this;
        }
        public java.util.List<CreateScheduleMonitorRequestCreateCommandMonitoredRuleConfigList> getMonitoredRuleConfigList() {
            return this.monitoredRuleConfigList;
        }

    }

}
