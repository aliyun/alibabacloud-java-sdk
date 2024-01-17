// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstanceGroupResponseBody extends TeaModel {
    @NameInMap("AppInstanceGroupModels")
    public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModels> appInstanceGroupModels;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
         * <p>应用图标。</p>
         */
        @NameInMap("AppIcon")
        public String appIcon;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        /**
         * <p>应用版本。</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>应用版本名称。</p>
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
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("EndTime")
        public String endTime;

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
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValues")
        public java.util.List<Integer> recurrenceValues;

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
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        @NameInMap("NodePoolId")
        public String nodePoolId;

        @NameInMap("NodeTypeName")
        public String nodeTypeName;

        @NameInMap("NodeUsed")
        public Integer nodeUsed;

        @NameInMap("RecurrenceSchedules")
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules> recurrenceSchedules;

        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        @NameInMap("ScalingNodeAmount")
        public Integer scalingNodeAmount;

        @NameInMap("ScalingNodeUsed")
        public Integer scalingNodeUsed;

        @NameInMap("ScalingStep")
        public Integer scalingStep;

        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        @NameInMap("StrategyDisableDate")
        public String strategyDisableDate;

        @NameInMap("StrategyEnableDate")
        public String strategyEnableDate;

        @NameInMap("StrategyType")
        public String strategyType;

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
        @NameInMap("NewOtaVersion")
        public String newOtaVersion;

        @NameInMap("OtaVersion")
        public String otaVersion;

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

    public static class ListAppInstanceGroupResponseBodyAppInstanceGroupModels extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("AppCenterImageId")
        public String appCenterImageId;

        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        @NameInMap("AppInstanceGroupName")
        public String appInstanceGroupName;

        @NameInMap("AppInstanceType")
        public String appInstanceType;

        /**
         * <p>策略ID。</p>
         */
        @NameInMap("AppPolicyId")
        public String appPolicyId;

        @NameInMap("Apps")
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps> apps;

        /**
         * <p>售卖模式。</p>
         */
        @NameInMap("ChargeResourceMode")
        public String chargeResourceMode;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("MaxAmount")
        public Integer maxAmount;

        @NameInMap("MinAmount")
        public Integer minAmount;

        @NameInMap("NodePool")
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool> nodePool;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("OtaInfo")
        public ListAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo otaInfo;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReserveAmountRatio")
        public String reserveAmountRatio;

        @NameInMap("ReserveMaxAmount")
        public Integer reserveMaxAmount;

        @NameInMap("ReserveMinAmount")
        public Integer reserveMinAmount;

        @NameInMap("ResourceStatus")
        public String resourceStatus;

        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        @NameInMap("ScalingStep")
        public Integer scalingStep;

        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        @NameInMap("SessionTimeout")
        public String sessionTimeout;

        @NameInMap("SkipUserAuthCheck")
        public Boolean skipUserAuthCheck;

        @NameInMap("SpecId")
        public String specId;

        @NameInMap("Status")
        public String status;

        public static ListAppInstanceGroupResponseBodyAppInstanceGroupModels build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceGroupResponseBodyAppInstanceGroupModels self = new ListAppInstanceGroupResponseBodyAppInstanceGroupModels();
            return TeaModel.build(map, self);
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

        public ListAppInstanceGroupResponseBodyAppInstanceGroupModels setApps(java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<ListAppInstanceGroupResponseBodyAppInstanceGroupModelsApps> getApps() {
            return this.apps;
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

    }

}
