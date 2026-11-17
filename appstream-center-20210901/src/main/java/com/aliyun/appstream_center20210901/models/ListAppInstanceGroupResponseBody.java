// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstanceGroupResponseBody extends TeaModel {
    /**
     * <p>The delivery group information.</p>
     */
    @NameInMap("AppInstanceGroupModels")
    public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModels> appInstanceGroupModels;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of query results.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAppInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceGroupResponseBody self = new ListAppInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceGroupResponseBody setAppInstanceGroupModels(java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModels> appInstanceGroupModels) {
        this.appInstanceGroupModels = appInstanceGroupModels;
        return this;
    }
    public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModels> getAppInstanceGroupModels() {
        return this.appInstanceGroupModels;
    }

    public ListAppInstanceGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppInstanceGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppInstanceGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps extends TeaModel {
        /**
         * <p>The application icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://app-center-icon-****.png">https://app-center-icon-****.png</a></p>
         */
        @NameInMap("AppIcon")
        public String appIcon;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-i87mycyn419nu****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Office App</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The application version name.</p>
         * 
         * <strong>example:</strong>
         * <p>Initial version</p>
         */
        @NameInMap("AppVersionName")
        public String appVersionName;

        public static ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps self = new ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps setAppIcon(String appIcon) {
            this.appIcon = appIcon;
            return this;
        }
        public String getAppIcon() {
            return this.appIcon;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

    }

    public static class ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods extends TeaModel {
        /**
         * <p>The target resource count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The end time. Format: HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>11:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time. Format: HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>09:30</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods self = new ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules extends TeaModel {
        /**
         * <p>The type of the policy execution schedule. You must specify both <code>RecurrenceType</code> and <code>RecurrenceValues</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The list of values for the policy execution schedule.</p>
         */
        @NameInMap("RecurrenceValues")
        public java.util.List<Integer> recurrenceValues;

        /**
         * <p>The list of time periods for the policy execution schedule.</p>
         */
        @NameInMap("TimerPeriods")
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods> timerPeriods;

        public static ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules self = new ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules setRecurrenceValues(java.util.List<Integer> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }
        public java.util.List<Integer> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules setTimerPeriods(java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods> timerPeriods) {
            this.timerPeriods = timerPeriods;
            return this;
        }
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods> getTimerPeriods() {
            return this.timerPeriods;
        }

    }

    public static class ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool extends TeaModel {
        /**
         * <p>The number of resources purchased when the delivery group is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The upper limit of idle sessions. If this value is specified, automatic scale-out is triggered only when the session usage exceeds <code>ScalingUsageThreshold</code> and the number of idle sessions in the current delivery group is less than <code>MaxIdleAppInstanceAmount</code>. Otherwise, the delivery group is considered to have sufficient idle sessions, and automatic scale-out is not triggered. This parameter can be used to flexibly control elastic scale-out behavior and reduce costs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxIdleAppInstanceAmount")
        public Integer maxIdleAppInstanceAmount;

        /**
         * <p>The maximum number of resources created during scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        /**
         * <p>The total number of current subscription resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The number of concurrent sessions, which is the number of sessions that a single resource can connect to simultaneously. If the number of concurrent sessions is too high, the application experience may degrade. The valid values vary based on the resource specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

        /**
         * <p>The instance type ID of the purchased resources.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu.4c8g.2g</p>
         */
        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        /**
         * <p>The node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-g6922kced36hx****</p>
         */
        @NameInMap("NodePoolId")
        public String nodePoolId;

        /**
         * <p>The name of the resource specification.</p>
         * 
         * <strong>example:</strong>
         * <p>WUYING-General-purpose_4vCPU8GB</p>
         */
        @NameInMap("NodeTypeName")
        public String nodeTypeName;

        /**
         * <p>The resource count of subscription resources in use.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeUsed")
        public Integer nodeUsed;

        /**
         * <p>The list of policy execution schedules.</p>
         */
        @NameInMap("RecurrenceSchedules")
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules> recurrenceSchedules;

        /**
         * <p>The duration without session connections, in minutes. When a resource has no session connections for the specified duration, automatic scale-in is triggered. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        /**
         * <p>The total number of elastic resources.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ScalingNodeAmount")
        public Integer scalingNodeAmount;

        /**
         * <p>The resource count of elastic resources in use.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ScalingNodeUsed")
        public Integer scalingNodeUsed;

        /**
         * <p>The number of resources created each time during scale-out. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScalingStep")
        public Integer scalingStep;

        /**
         * <p>The upper limit threshold for session usage (%). When the session usage exceeds this threshold, automatic scale-out is triggered. Session usage is calculated as: <code>Session usage = Current number of sessions / (Total number of resources × Number of concurrent sessions per resource) × 100%</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        /**
         * <p>The strategy expiration date. Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08</p>
         */
        @NameInMap("StrategyDisableDate")
        public String strategyDisableDate;

        /**
         * <p>The strategy effective date. Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01</p>
         */
        @NameInMap("StrategyEnableDate")
        public String strategyEnableDate;

        /**
         * <p>The elastic policy type.</p>
         * <blockquote>
         * <p><code>NODE_SCALING_BY_USAGE</code> (usage-based scaling policy) applies only to <code>PrePaid</code> (subscription) resources. <code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling policy) applies only to <code>PostPaid</code> (pay-as-you-go) resources.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NODE_FIXED</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <p>Specifies whether the resource prefetch strategy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WarmUp")
        public Boolean warmUp;

        public static ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool self = new ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setMaxIdleAppInstanceAmount(Integer maxIdleAppInstanceAmount) {
            this.maxIdleAppInstanceAmount = maxIdleAppInstanceAmount;
            return this;
        }
        public Integer getMaxIdleAppInstanceAmount() {
            return this.maxIdleAppInstanceAmount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setMaxScalingAmount(Integer maxScalingAmount) {
            this.maxScalingAmount = maxScalingAmount;
            return this;
        }
        public Integer getMaxScalingAmount() {
            return this.maxScalingAmount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodeCapacity(Integer nodeCapacity) {
            this.nodeCapacity = nodeCapacity;
            return this;
        }
        public Integer getNodeCapacity() {
            return this.nodeCapacity;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodeInstanceType(String nodeInstanceType) {
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodeUsed(Integer nodeUsed) {
            this.nodeUsed = nodeUsed;
            return this;
        }
        public Integer getNodeUsed() {
            return this.nodeUsed;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setRecurrenceSchedules(java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules> recurrenceSchedules) {
            this.recurrenceSchedules = recurrenceSchedules;
            return this;
        }
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules> getRecurrenceSchedules() {
            return this.recurrenceSchedules;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setScalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
            this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
            return this;
        }
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setScalingNodeAmount(Integer scalingNodeAmount) {
            this.scalingNodeAmount = scalingNodeAmount;
            return this;
        }
        public Integer getScalingNodeAmount() {
            return this.scalingNodeAmount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setScalingNodeUsed(Integer scalingNodeUsed) {
            this.scalingNodeUsed = scalingNodeUsed;
            return this;
        }
        public Integer getScalingNodeUsed() {
            return this.scalingNodeUsed;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setScalingStep(Integer scalingStep) {
            this.scalingStep = scalingStep;
            return this;
        }
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setScalingUsageThreshold(String scalingUsageThreshold) {
            this.scalingUsageThreshold = scalingUsageThreshold;
            return this;
        }
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setStrategyDisableDate(String strategyDisableDate) {
            this.strategyDisableDate = strategyDisableDate;
            return this;
        }
        public String getStrategyDisableDate() {
            return this.strategyDisableDate;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setStrategyEnableDate(String strategyEnableDate) {
            this.strategyEnableDate = strategyEnableDate;
            return this;
        }
        public String getStrategyEnableDate() {
            return this.strategyEnableDate;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setWarmUp(Boolean warmUp) {
            this.warmUp = warmUp;
            return this;
        }
        public Boolean getWarmUp() {
            return this.warmUp;
        }

    }

    public static class ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo extends TeaModel {
        /**
         * <p>The new OTA version. An empty value indicates that no new version is available.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1-D-20220630.11****</p>
         */
        @NameInMap("NewOtaVersion")
        public String newOtaVersion;

        /**
         * <p>The current OTA version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1-D-20220615.11****</p>
         */
        @NameInMap("OtaVersion")
        public String otaVersion;

        /**
         * <p>The ID of the OTA upgrade task.</p>
         * 
         * <strong>example:</strong>
         * <p>ota-e49929gv8acz5****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo self = new ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo setNewOtaVersion(String newOtaVersion) {
            this.newOtaVersion = newOtaVersion;
            return this;
        }
        public String getNewOtaVersion() {
            return this.newOtaVersion;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo setOtaVersion(String otaVersion) {
            this.otaVersion = otaVersion;
            return this;
        }
        public String getOtaVersion() {
            return this.otaVersion;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListAppInstanceGroupResponseBodyAppInstanceGroupModelsResourceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag type.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>design</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAppInstanceGroupResponseBodyAppInstanceGroupModelsResourceTags build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceGroupResponseBodyAppInstanceGroupModelsResourceTags self = new ListAppInstanceGroupResponseBodyAppInstanceGroupModelsResourceTags();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsResourceTags setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppInstanceGroupResponseBodyAppInstanceGroupModelsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag type.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>design</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAppInstanceGroupResponseBodyAppInstanceGroupModelsTags build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceGroupResponseBodyAppInstanceGroupModelsTags self = new ListAppInstanceGroupResponseBodyAppInstanceGroupModelsTags();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsTags setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppInstanceGroupResponseBodyAppInstanceGroupModels extends TeaModel {
        /**
         * <p>The access type.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The number of subscription resources specified by the user. The minimum value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The application image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>img-8z4nztpaqvay4****</p>
         */
        @NameInMap("AppCenterImageId")
        public String appCenterImageId;

        /**
         * <p>The ID of the app instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The name of the app instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>Office App</p>
         */
        @NameInMap("AppInstanceGroupName")
        public String appInstanceGroupName;

        /**
         * <p>The specification type of the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>dynamic</strong></p>
         */
        @NameInMap("AppInstanceType")
        public String appInstanceType;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-g3k5wa2ms2****</p>
         */
        @NameInMap("AppPolicyId")
        public String appPolicyId;

        /**
         * <p>Specifies whether the current image supports the unified policy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AppPolicyImageCheck")
        public Boolean appPolicyImageCheck;

        /**
         * <p>The policy version.</p>
         * 
         * <strong>example:</strong>
         * <p>CENTER</p>
         */
        @NameInMap("AppPolicyVersion")
        public String appPolicyVersion;

        /**
         * <p>The application information.</p>
         */
        @NameInMap("Apps")
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps> apps;

        /**
         * <p>The authorization mode.</p>
         * 
         * <strong>example:</strong>
         * <p>App</p>
         */
        @NameInMap("AuthMode")
        public String authMode;

        /**
         * <p>The sales mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Node</p>
         */
        @NameInMap("ChargeResourceMode")
        public String chargeResourceMode;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The expiration time of the app instance group. The time is displayed in the ISO 8601 date and time format, including milliseconds and time zone offset. Format template: yyyy-MM-dd\&quot;T\&quot;HH:mm:ss.SSSXXX.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-27T16:00:00.000+00:00</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-26T15:06:16.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The maximum number of instances. The minimum value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxAmount")
        public Integer maxAmount;

        /**
         * <p>The minimum number of instances. The minimum value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinAmount")
        public Integer minAmount;

        /**
         * <p>The node pool information.</p>
         */
        @NameInMap("NodePool")
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool> nodePool;

        /**
         * <p>The ID of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing+dir-172301****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The operating system type.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The OTA upgrade task information.</p>
         */
        @NameInMap("OtaInfo")
        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo otaInfo;

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the region to which the app instance group belongs. For more information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The percentage of reserved instances, which is the proportion of unused sessions in the delivery group. Valid values: 0 to 99.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ReserveAmountRatio")
        public String reserveAmountRatio;

        /**
         * <p>The maximum number of reserved instances, which is the maximum number of unused sessions in the delivery group. The minimum value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReserveMaxAmount")
        public Integer reserveMaxAmount;

        /**
         * <p>The minimum number of reserved instances, which is the minimum number of unused sessions in the delivery group. The minimum value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReserveMinAmount")
        public Integer reserveMinAmount;

        /**
         * <p>The resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The list of resource tags.</p>
         */
        @NameInMap("ResourceTags")
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsResourceTags> resourceTags;

        /**
         * <p>The duration without session connections, in minutes. When a resource has no session connections for the specified duration, automatic scale-in is triggered. The minimum value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        /**
         * <p>The number of sessions created each time during scale-out. The minimum value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ScalingStep")
        public Integer scalingStep;

        /**
         * <p>The upper limit threshold for session usage (%). When the session usage exceeds this threshold, automatic scale-out is triggered. Session usage is calculated as: Session usage = Number of active sessions / Total number of sessions × 100%. Valid values: 0 to 99.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        /**
         * <p>The session disconnection retention period, in minutes. After an end user\&quot;s session is disconnected, the session is retained for the specified period before being logged off. To retain the session indefinitely, set this parameter to <code>-1</code>. Valid values: -1 and 3 to 300. Default value: <code>15</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("SessionTimeout")
        public String sessionTimeout;

        /**
         * <p>Specifies whether to skip user authorization verification.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SkipUserAuthCheck")
        public Boolean skipUserAuthCheck;

        /**
         * <p>The ID that uniquely corresponds to the app instance group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>spec-8o18t8uc31qib0****</p>
         */
        @NameInMap("SpecId")
        public String specId;

        /**
         * <p>The status of the app instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Specifies whether mixed authorization for users and user groups is supported.</p>
         */
        @NameInMap("SupportUserGroupMixedAuth")
        public Boolean supportUserGroupMixedAuth;

        /**
         * <p>The list of resource tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsTags> tags;

        /**
         * <p>The user and user group authorization mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Mixed</p>
         */
        @NameInMap("UserGroupAuthMode")
        public String userGroupAuthMode;

        public static ListAppInstanceGroupResponseBodyAppInstanceGroupModels build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceGroupResponseBodyAppInstanceGroupModels self = new ListAppInstanceGroupResponseBodyAppInstanceGroupModels();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setAppCenterImageId(String appCenterImageId) {
            this.appCenterImageId = appCenterImageId;
            return this;
        }
        public String getAppCenterImageId() {
            return this.appCenterImageId;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setAppInstanceGroupName(String appInstanceGroupName) {
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setAppPolicyId(String appPolicyId) {
            this.appPolicyId = appPolicyId;
            return this;
        }
        public String getAppPolicyId() {
            return this.appPolicyId;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setAppPolicyImageCheck(Boolean appPolicyImageCheck) {
            this.appPolicyImageCheck = appPolicyImageCheck;
            return this;
        }
        public Boolean getAppPolicyImageCheck() {
            return this.appPolicyImageCheck;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setAppPolicyVersion(String appPolicyVersion) {
            this.appPolicyVersion = appPolicyVersion;
            return this;
        }
        public String getAppPolicyVersion() {
            return this.appPolicyVersion;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setApps(java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps> getApps() {
            return this.apps;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setAuthMode(String authMode) {
            this.authMode = authMode;
            return this;
        }
        public String getAuthMode() {
            return this.authMode;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setChargeResourceMode(String chargeResourceMode) {
            this.chargeResourceMode = chargeResourceMode;
            return this;
        }
        public String getChargeResourceMode() {
            return this.chargeResourceMode;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setMaxAmount(Integer maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setMinAmount(Integer minAmount) {
            this.minAmount = minAmount;
            return this;
        }
        public Integer getMinAmount() {
            return this.minAmount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setNodePool(java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool> nodePool) {
            this.nodePool = nodePool;
            return this;
        }
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool> getNodePool() {
            return this.nodePool;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setOtaInfo(ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo otaInfo) {
            this.otaInfo = otaInfo;
            return this;
        }
        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo getOtaInfo() {
            return this.otaInfo;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setReserveAmountRatio(String reserveAmountRatio) {
            this.reserveAmountRatio = reserveAmountRatio;
            return this;
        }
        public String getReserveAmountRatio() {
            return this.reserveAmountRatio;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setReserveMaxAmount(Integer reserveMaxAmount) {
            this.reserveMaxAmount = reserveMaxAmount;
            return this;
        }
        public Integer getReserveMaxAmount() {
            return this.reserveMaxAmount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setReserveMinAmount(Integer reserveMinAmount) {
            this.reserveMinAmount = reserveMinAmount;
            return this;
        }
        public Integer getReserveMinAmount() {
            return this.reserveMinAmount;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setResourceTags(java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsResourceTags> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsResourceTags> getResourceTags() {
            return this.resourceTags;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setScalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
            this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
            return this;
        }
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setScalingStep(Integer scalingStep) {
            this.scalingStep = scalingStep;
            return this;
        }
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setScalingUsageThreshold(String scalingUsageThreshold) {
            this.scalingUsageThreshold = scalingUsageThreshold;
            return this;
        }
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setSessionTimeout(String sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }
        public String getSessionTimeout() {
            return this.sessionTimeout;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setSkipUserAuthCheck(Boolean skipUserAuthCheck) {
            this.skipUserAuthCheck = skipUserAuthCheck;
            return this;
        }
        public Boolean getSkipUserAuthCheck() {
            return this.skipUserAuthCheck;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setSupportUserGroupMixedAuth(Boolean supportUserGroupMixedAuth) {
            this.supportUserGroupMixedAuth = supportUserGroupMixedAuth;
            return this;
        }
        public Boolean getSupportUserGroupMixedAuth() {
            return this.supportUserGroupMixedAuth;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setTags(java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsTags> getTags() {
            return this.tags;
        }

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setUserGroupAuthMode(String userGroupAuthMode) {
            this.userGroupAuthMode = userGroupAuthMode;
            return this;
        }
        public String getUserGroupAuthMode() {
            return this.userGroupAuthMode;
        }

    }

}
