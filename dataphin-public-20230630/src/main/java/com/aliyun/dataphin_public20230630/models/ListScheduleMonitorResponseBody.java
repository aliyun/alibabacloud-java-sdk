// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListScheduleMonitorResponseBody extends TeaModel {
    /**
     * <p>The error code of the request. A value of OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paginated result of the scheduling monitoring alert query.</p>
     */
    @NameInMap("PageResult")
    public ListScheduleMonitorResponseBodyPageResult pageResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListScheduleMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleMonitorResponseBody self = new ListScheduleMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduleMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScheduleMonitorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScheduleMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScheduleMonitorResponseBody setPageResult(ListScheduleMonitorResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListScheduleMonitorResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListScheduleMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduleMonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListBizUnit extends TeaModel {
        /**
         * <p>The display name of the business segment.</p>
         * 
         * <strong>example:</strong>
         * <p>Test segment</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the business segment.</p>
         * 
         * <strong>example:</strong>
         * <p>6612345678901234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the business segment.</p>
         * 
         * <strong>example:</strong>
         * <p>bd_demo</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListBizUnit build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListBizUnit self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListBizUnit();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListBizUnit setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListBizUnit setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListBizUnit setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable extends TeaModel {
        /**
         * <p>The ID of the business segment.</p>
         * 
         * <strong>example:</strong>
         * <p>6612345678901234</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The ID of the monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>6812345678901234</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>dim_user</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The subtype of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE_SQL</p>
         */
        @NameInMap("NodeSubType")
        public String nodeSubType;

        /**
         * <p>The list of O&amp;M owner IDs.</p>
         */
        @NameInMap("OwnerIdList")
        public java.util.List<String> ownerIdList;

        /**
         * <p>The name of the project to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The type of the scheduling period.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriodType")
        public String schedulePeriodType;

        /**
         * <p>Specifies whether data delay is supported.</p>
         */
        @NameInMap("SupportDataDelay")
        public Boolean supportDataDelay;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable setNodeSubType(String nodeSubType) {
            this.nodeSubType = nodeSubType;
            return this;
        }
        public String getNodeSubType() {
            return this.nodeSubType;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable setOwnerIdList(java.util.List<String> ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public java.util.List<String> getOwnerIdList() {
            return this.ownerIdList;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable setSchedulePeriodType(String schedulePeriodType) {
            this.schedulePeriodType = schedulePeriodType;
            return this;
        }
        public String getSchedulePeriodType() {
            return this.schedulePeriodType;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable setSupportDataDelay(Boolean supportDataDelay) {
            this.supportDataDelay = supportDataDelay;
            return this;
        }
        public Boolean getSupportDataDelay() {
            return this.supportDataDelay;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRangeFilterRuleList extends TeaModel {
        /**
         * <p>The filter key.</p>
         * 
         * <strong>example:</strong>
         * <p>NODE_NAME</p>
         */
        @NameInMap("FilterKey")
        public String filterKey;

        /**
         * <p>The list of filter values.</p>
         */
        @NameInMap("FilterValueList")
        public java.util.List<String> filterValueList;

        /**
         * <p>Specifies whether to invert the selection.</p>
         */
        @NameInMap("IsExclude")
        public Boolean isExclude;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRangeFilterRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRangeFilterRuleList self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRangeFilterRuleList();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRangeFilterRuleList setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRangeFilterRuleList setFilterValueList(java.util.List<String> filterValueList) {
            this.filterValueList = filterValueList;
            return this;
        }
        public java.util.List<String> getFilterValueList() {
            return this.filterValueList;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRangeFilterRuleList setIsExclude(Boolean isExclude) {
            this.isExclude = isExclude;
            return this;
        }
        public Boolean getIsExclude() {
            return this.isExclude;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRange extends TeaModel {
        /**
         * <p>The list of filter rules.</p>
         */
        @NameInMap("FilterRuleList")
        public java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRangeFilterRuleList> filterRuleList;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRange build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRange self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRange();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRange setFilterRuleList(java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRangeFilterRuleList> filterRuleList) {
            this.filterRuleList = filterRuleList;
            return this;
        }
        public java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRangeFilterRuleList> getFilterRuleList() {
            return this.filterRuleList;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigDailyUnfinishedConfig extends TeaModel {
        /**
         * <p>The time of day for the unfinished check, in HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("FixedUnfinishedTime")
        public String fixedUnfinishedTime;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigDailyUnfinishedConfig build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigDailyUnfinishedConfig self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigDailyUnfinishedConfig();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigDailyUnfinishedConfig setFixedUnfinishedTime(String fixedUnfinishedTime) {
            this.fixedUnfinishedTime = fixedUnfinishedTime;
            return this;
        }
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList extends TeaModel {
        /**
         * <p>The time for the unfinished check, in HH:mm format.</p>
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

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList setFixedUnfinishedTime(String fixedUnfinishedTime) {
            this.fixedUnfinishedTime = fixedUnfinishedTime;
            return this;
        }
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList setPeriodNum(Integer periodNum) {
            this.periodNum = periodNum;
            return this;
        }
        public Integer getPeriodNum() {
            return this.periodNum;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig extends TeaModel {
        /**
         * <p>The list of custom monitoring periods.</p>
         */
        @NameInMap("CustomPeriodList")
        public java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList> customPeriodList;

        /**
         * <p>The interval value.</p>
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
         * <p>The trigger rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERVAL_AFTER_DUE_TIME</p>
         */
        @NameInMap("TriggerRuleType")
        public String triggerRuleType;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setCustomPeriodList(java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList> customPeriodList) {
            this.customPeriodList = customPeriodList;
            return this;
        }
        public java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfigCustomPeriodList> getCustomPeriodList() {
            return this.customPeriodList;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setIntervalAfterDueTime(Integer intervalAfterDueTime) {
            this.intervalAfterDueTime = intervalAfterDueTime;
            return this;
        }
        public Integer getIntervalAfterDueTime() {
            return this.intervalAfterDueTime;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setMonitorPeriodType(String monitorPeriodType) {
            this.monitorPeriodType = monitorPeriodType;
            return this;
        }
        public String getMonitorPeriodType() {
            return this.monitorPeriodType;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig setTriggerRuleType(String triggerRuleType) {
            this.triggerRuleType = triggerRuleType;
            return this;
        }
        public String getTriggerRuleType() {
            return this.triggerRuleType;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfig extends TeaModel {
        /**
         * <p>The daily configuration for unfinished tasks.</p>
         */
        @NameInMap("DailyUnfinishedConfig")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigDailyUnfinishedConfig dailyUnfinishedConfig;

        /**
         * <p>The multi-period unfinished configuration.</p>
         */
        @NameInMap("MultiPeriodUnfinishedConfig")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfig build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfig self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfig();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfig setDailyUnfinishedConfig(ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigDailyUnfinishedConfig dailyUnfinishedConfig) {
            this.dailyUnfinishedConfig = dailyUnfinishedConfig;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigDailyUnfinishedConfig getDailyUnfinishedConfig() {
            return this.dailyUnfinishedConfig;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfig setMultiPeriodUnfinishedConfig(ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig) {
            this.multiPeriodUnfinishedConfig = multiPeriodUnfinishedConfig;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfigMultiPeriodUnfinishedConfig getMultiPeriodUnfinishedConfig() {
            return this.multiPeriodUnfinishedConfig;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason extends TeaModel {
        /**
         * <p>The type of the alert reason. Valid values: FAILED, TIME_OUT, UNFINISHED, SUCCESS, and DATA_DELAY.</p>
         * 
         * <strong>example:</strong>
         * <p>TIME_OUT</p>
         */
        @NameInMap("AlertReasonType")
        public String alertReasonType;

        /**
         * <p>The timeout period in minutes. This parameter is returned only when the alert reason type is TIME_OUT.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("FixedElapsedTime")
        public Long fixedElapsedTime;

        /**
         * <p>The daily check time for unfinished tasks in HH:mm format. This parameter is returned only when the alert reason type is UNFINISHED.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("FixedUnfinishedTime")
        public String fixedUnfinishedTime;

        /**
         * <p>The detailed configuration of the unfinished rule. This parameter is returned only when the alert reason type is UNFINISHED.</p>
         */
        @NameInMap("UnfinishedRuleDetailConfig")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfig unfinishedRuleDetailConfig;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason setAlertReasonType(String alertReasonType) {
            this.alertReasonType = alertReasonType;
            return this;
        }
        public String getAlertReasonType() {
            return this.alertReasonType;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason setFixedElapsedTime(Long fixedElapsedTime) {
            this.fixedElapsedTime = fixedElapsedTime;
            return this;
        }
        public Long getFixedElapsedTime() {
            return this.fixedElapsedTime;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason setFixedUnfinishedTime(String fixedUnfinishedTime) {
            this.fixedUnfinishedTime = fixedUnfinishedTime;
            return this;
        }
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason setUnfinishedRuleDetailConfig(ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfig unfinishedRuleDetailConfig) {
            this.unfinishedRuleDetailConfig = unfinishedRuleDetailConfig;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReasonUnfinishedRuleDetailConfig getUnfinishedRuleDetailConfig() {
            return this.unfinishedRuleDetailConfig;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyMonitoredTimeRange extends TeaModel {
        /**
         * <p>The end time in HH:mm format. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>11:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time in HH:mm format. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyMonitoredTimeRange build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyMonitoredTimeRange self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyMonitoredTimeRange();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyMonitoredTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyMonitoredTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList extends TeaModel {
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
         * <p>The list of notification methods. Valid values: PHONE, MESSAGE, EMAIL, DING_TALK, FEISHU, WECHAT, and CUSTOM.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ReceivedWayList")
        public java.util.List<String> receivedWayList;

        /**
         * <p>The recipient type. Valid values: OWNER (owner), USER_CUSTOM (custom user), and ON_DUTY_TABLE (on-duty table).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_CUSTOM</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The list of recipient user IDs. This parameter is required when ReceiverType is set to USER_CUSTOM.</p>
         */
        @NameInMap("ReceiverUserIdList")
        public java.util.List<String> receiverUserIdList;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList setCustomAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
            this.customAlertChannelIdList = customAlertChannelIdList;
            return this;
        }
        public java.util.List<String> getCustomAlertChannelIdList() {
            return this.customAlertChannelIdList;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList setOnDutyTableIdList(java.util.List<String> onDutyTableIdList) {
            this.onDutyTableIdList = onDutyTableIdList;
            return this;
        }
        public java.util.List<String> getOnDutyTableIdList() {
            return this.onDutyTableIdList;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList setReceivedWayList(java.util.List<String> receivedWayList) {
            this.receivedWayList = receivedWayList;
            return this;
        }
        public java.util.List<String> getReceivedWayList() {
            return this.receivedWayList;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList setReceiverUserIdList(java.util.List<String> receiverUserIdList) {
            this.receiverUserIdList = receiverUserIdList;
            return this;
        }
        public java.util.List<String> getReceiverUserIdList() {
            return this.receiverUserIdList;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy extends TeaModel {
        /**
         * <p>The alert trigger frequency.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AlertFrequency")
        public Integer alertFrequency;

        /**
         * <p>The monitored time range.</p>
         */
        @NameInMap("MonitoredTimeRange")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyMonitoredTimeRange monitoredTimeRange;

        /**
         * <p>The list of recipient configurations.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ReceiverConfigList")
        public java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList> receiverConfigList;

        /**
         * <p>The maximum number of alert notifications to send.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SendTimes")
        public Integer sendTimes;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy setAlertFrequency(Integer alertFrequency) {
            this.alertFrequency = alertFrequency;
            return this;
        }
        public Integer getAlertFrequency() {
            return this.alertFrequency;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy setMonitoredTimeRange(ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyMonitoredTimeRange monitoredTimeRange) {
            this.monitoredTimeRange = monitoredTimeRange;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyMonitoredTimeRange getMonitoredTimeRange() {
            return this.monitoredTimeRange;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy setReceiverConfigList(java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList> receiverConfigList) {
            this.receiverConfigList = receiverConfigList;
            return this;
        }
        public java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategyReceiverConfigList> getReceiverConfigList() {
            return this.receiverConfigList;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy setSendTimes(Integer sendTimes) {
            this.sendTimes = sendTimes;
            return this;
        }
        public Integer getSendTimes() {
            return this.sendTimes;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListCreator extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>200012345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListCreator build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListCreator self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListCreator();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListModifier extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>200012345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>Li Si</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListModifier build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListModifier self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListModifier();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList extends TeaModel {
        /**
         * <p>The reason for the alert.</p>
         */
        @NameInMap("AlertReason")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason alertReason;

        /**
         * <p>The alert strategy.</p>
         */
        @NameInMap("AlertStrategy")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy alertStrategy;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-10 15:30:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         */
        @NameInMap("Creator")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListCreator creator;

        /**
         * <p>The monitoring rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6912345678909876</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-10 15:30:00</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The last modifier.</p>
         */
        @NameInMap("Modifier")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListModifier modifier;

        /**
         * <p>The ID of the associated monitoring item.</p>
         * 
         * <strong>example:</strong>
         * <p>6912345678901234</p>
         */
        @NameInMap("MonitoredItemId")
        public Long monitoredItemId;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7086194564164288</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The enablement status of the rule.</p>
         */
        @NameInMap("SwitchStatus")
        public Boolean switchStatus;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setAlertReason(ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason alertReason) {
            this.alertReason = alertReason;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertReason getAlertReason() {
            return this.alertReason;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setAlertStrategy(ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy alertStrategy) {
            this.alertStrategy = alertStrategy;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListAlertStrategy getAlertStrategy() {
            return this.alertStrategy;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setCreator(ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListCreator creator) {
            this.creator = creator;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListCreator getCreator() {
            return this.creator;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setModifier(ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleListModifier getModifier() {
            return this.modifier;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setMonitoredItemId(Long monitoredItemId) {
            this.monitoredItemId = monitoredItemId;
            return this;
        }
        public Long getMonitoredItemId() {
            return this.monitoredItemId;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setSwitchStatus(Boolean switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public Boolean getSwitchStatus() {
            return this.switchStatus;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask extends TeaModel {
        /**
         * <p>The ID of the monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>6712345678901234</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_order_detail</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the project to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The schedule period type. Valid values: MINUTELY, HOURLY, DAILY, WEEKLY, MONTHLY, and YEARLY.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriodType")
        public String schedulePeriodType;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask setSchedulePeriodType(String schedulePeriodType) {
            this.schedulePeriodType = schedulePeriodType;
            return this;
        }
        public String getSchedulePeriodType() {
            return this.schedulePeriodType;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemListProjectInfo extends TeaModel {
        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7086194564164288</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemListProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemListProjectInfo self = new ListScheduleMonitorResponseBodyPageResultMonitorItemListProjectInfo();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListProjectInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemListProjectInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResultMonitorItemList extends TeaModel {
        /**
         * <p>The business segment information.</p>
         */
        @NameInMap("BizUnit")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListBizUnit bizUnit;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-10 15:30:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The logical table information.</p>
         */
        @NameInMap("LogicTable")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable logicTable;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-10 15:30:00</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The scope of the monitoring task.</p>
         */
        @NameInMap("MonitorNodeRange")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRange monitorNodeRange;

        /**
         * <p>The ID of the monitored object.</p>
         * 
         * <strong>example:</strong>
         * <p>6912345678901234</p>
         */
        @NameInMap("MonitoredItemId")
        public Long monitoredItemId;

        /**
         * <p>The list of monitoring rules.</p>
         */
        @NameInMap("MonitoredRuleList")
        public java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList> monitoredRuleList;

        /**
         * <p>The monitored task information.</p>
         */
        @NameInMap("MonitoredTask")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask monitoredTask;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7086194564164288</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The project information.</p>
         */
        @NameInMap("ProjectInfo")
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListProjectInfo projectInfo;

        /**
         * <p>The business subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE_SQL</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The monitored object type.</p>
         * 
         * <strong>example:</strong>
         * <p>SCHEDULE_PHYSICAL_NODE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListScheduleMonitorResponseBodyPageResultMonitorItemList build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResultMonitorItemList self = new ListScheduleMonitorResponseBodyPageResultMonitorItemList();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setBizUnit(ListScheduleMonitorResponseBodyPageResultMonitorItemListBizUnit bizUnit) {
            this.bizUnit = bizUnit;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListBizUnit getBizUnit() {
            return this.bizUnit;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setLogicTable(ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable logicTable) {
            this.logicTable = logicTable;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListLogicTable getLogicTable() {
            return this.logicTable;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setMonitorNodeRange(ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRange monitorNodeRange) {
            this.monitorNodeRange = monitorNodeRange;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitorNodeRange getMonitorNodeRange() {
            return this.monitorNodeRange;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setMonitoredItemId(Long monitoredItemId) {
            this.monitoredItemId = monitoredItemId;
            return this;
        }
        public Long getMonitoredItemId() {
            return this.monitoredItemId;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setMonitoredRuleList(java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList> monitoredRuleList) {
            this.monitoredRuleList = monitoredRuleList;
            return this;
        }
        public java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredRuleList> getMonitoredRuleList() {
            return this.monitoredRuleList;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setMonitoredTask(ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask monitoredTask) {
            this.monitoredTask = monitoredTask;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListMonitoredTask getMonitoredTask() {
            return this.monitoredTask;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setProjectInfo(ListScheduleMonitorResponseBodyPageResultMonitorItemListProjectInfo projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }
        public ListScheduleMonitorResponseBodyPageResultMonitorItemListProjectInfo getProjectInfo() {
            return this.projectInfo;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListScheduleMonitorResponseBodyPageResultMonitorItemList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListScheduleMonitorResponseBodyPageResult extends TeaModel {
        /**
         * <p>The list of monitored objects on the current page.</p>
         */
        @NameInMap("MonitorItemList")
        public java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemList> monitorItemList;

        /**
         * <p>The total number of monitored objects that meet the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListScheduleMonitorResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleMonitorResponseBodyPageResult self = new ListScheduleMonitorResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListScheduleMonitorResponseBodyPageResult setMonitorItemList(java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemList> monitorItemList) {
            this.monitorItemList = monitorItemList;
            return this;
        }
        public java.util.List<ListScheduleMonitorResponseBodyPageResultMonitorItemList> getMonitorItemList() {
            return this.monitorItemList;
        }

        public ListScheduleMonitorResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
