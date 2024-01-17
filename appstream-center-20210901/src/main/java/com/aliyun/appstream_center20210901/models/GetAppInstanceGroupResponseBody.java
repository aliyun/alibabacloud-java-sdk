// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetAppInstanceGroupResponseBody extends TeaModel {
    /**
     * <p>AppInstanceGroupModels</p>
     */
    @NameInMap("AppInstanceGroupModels")
    public GetAppInstanceGroupResponseBodyAppInstanceGroupModels appInstanceGroupModels;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceGroupResponseBody self = new GetAppInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceGroupResponseBody setAppInstanceGroupModels(GetAppInstanceGroupResponseBodyAppInstanceGroupModels appInstanceGroupModels) {
        this.appInstanceGroupModels = appInstanceGroupModels;
        return this;
    }
    public GetAppInstanceGroupResponseBodyAppInstanceGroupModels getAppInstanceGroupModels() {
        return this.appInstanceGroupModels;
    }

    public GetAppInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps extends TeaModel {
        @NameInMap("AppIcon")
        public String appIcon;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("AppVersionName")
        public String appVersionName;

        public static GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps self = new GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps setAppIcon(String appIcon) {
            this.appIcon = appIcon;
            return this;
        }
        public String getAppIcon() {
            return this.appIcon;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

    }

    public static class GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods self = new GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules extends TeaModel {
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValues")
        public java.util.List<Integer> recurrenceValues;

        @NameInMap("TimerPeriods")
        public java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods> timerPeriods;

        public static GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules self = new GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules setRecurrenceValues(java.util.List<Integer> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }
        public java.util.List<Integer> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules setTimerPeriods(java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods> timerPeriods) {
            this.timerPeriods = timerPeriods;
            return this;
        }
        public java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedulesTimerPeriods> getTimerPeriods() {
            return this.timerPeriods;
        }

    }

    public static class GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool extends TeaModel {
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
        public java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules> recurrenceSchedules;

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

        public static GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool self = new GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setMaxScalingAmount(Integer maxScalingAmount) {
            this.maxScalingAmount = maxScalingAmount;
            return this;
        }
        public Integer getMaxScalingAmount() {
            return this.maxScalingAmount;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodeCapacity(Integer nodeCapacity) {
            this.nodeCapacity = nodeCapacity;
            return this;
        }
        public Integer getNodeCapacity() {
            return this.nodeCapacity;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodeInstanceType(String nodeInstanceType) {
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setNodeUsed(Integer nodeUsed) {
            this.nodeUsed = nodeUsed;
            return this;
        }
        public Integer getNodeUsed() {
            return this.nodeUsed;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setRecurrenceSchedules(java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules> recurrenceSchedules) {
            this.recurrenceSchedules = recurrenceSchedules;
            return this;
        }
        public java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePoolRecurrenceSchedules> getRecurrenceSchedules() {
            return this.recurrenceSchedules;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setScalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
            this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
            return this;
        }
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setScalingNodeAmount(Integer scalingNodeAmount) {
            this.scalingNodeAmount = scalingNodeAmount;
            return this;
        }
        public Integer getScalingNodeAmount() {
            return this.scalingNodeAmount;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setScalingNodeUsed(Integer scalingNodeUsed) {
            this.scalingNodeUsed = scalingNodeUsed;
            return this;
        }
        public Integer getScalingNodeUsed() {
            return this.scalingNodeUsed;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setScalingStep(Integer scalingStep) {
            this.scalingStep = scalingStep;
            return this;
        }
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setScalingUsageThreshold(String scalingUsageThreshold) {
            this.scalingUsageThreshold = scalingUsageThreshold;
            return this;
        }
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setStrategyDisableDate(String strategyDisableDate) {
            this.strategyDisableDate = strategyDisableDate;
            return this;
        }
        public String getStrategyDisableDate() {
            return this.strategyDisableDate;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setStrategyEnableDate(String strategyEnableDate) {
            this.strategyEnableDate = strategyEnableDate;
            return this;
        }
        public String getStrategyEnableDate() {
            return this.strategyEnableDate;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool setWarmUp(Boolean warmUp) {
            this.warmUp = warmUp;
            return this;
        }
        public Boolean getWarmUp() {
            return this.warmUp;
        }

    }

    public static class GetAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo extends TeaModel {
        @NameInMap("NewOtaVersion")
        public String newOtaVersion;

        @NameInMap("OtaVersion")
        public String otaVersion;

        @NameInMap("TaskId")
        public String taskId;

        public static GetAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo self = new GetAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo setNewOtaVersion(String newOtaVersion) {
            this.newOtaVersion = newOtaVersion;
            return this;
        }
        public String getNewOtaVersion() {
            return this.newOtaVersion;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo setOtaVersion(String otaVersion) {
            this.otaVersion = otaVersion;
            return this;
        }
        public String getOtaVersion() {
            return this.otaVersion;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetAppInstanceGroupResponseBodyAppInstanceGroupModels extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("AppCenterImageId")
        public String appCenterImageId;

        @NameInMap("AppCenterImageName")
        public String appCenterImageName;

        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        @NameInMap("AppInstanceGroupName")
        public String appInstanceGroupName;

        @NameInMap("AppInstanceType")
        public String appInstanceType;

        @NameInMap("AppInstanceTypeName")
        public String appInstanceTypeName;

        @NameInMap("AppPolicyId")
        public String appPolicyId;

        @NameInMap("Apps")
        public java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps> apps;

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
        public java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool> nodePool;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("OtaInfo")
        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo otaInfo;

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

        public static GetAppInstanceGroupResponseBodyAppInstanceGroupModels build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceGroupResponseBodyAppInstanceGroupModels self = new GetAppInstanceGroupResponseBodyAppInstanceGroupModels();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setAppCenterImageId(String appCenterImageId) {
            this.appCenterImageId = appCenterImageId;
            return this;
        }
        public String getAppCenterImageId() {
            return this.appCenterImageId;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setAppCenterImageName(String appCenterImageName) {
            this.appCenterImageName = appCenterImageName;
            return this;
        }
        public String getAppCenterImageName() {
            return this.appCenterImageName;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setAppInstanceGroupName(String appInstanceGroupName) {
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setAppInstanceTypeName(String appInstanceTypeName) {
            this.appInstanceTypeName = appInstanceTypeName;
            return this;
        }
        public String getAppInstanceTypeName() {
            return this.appInstanceTypeName;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setAppPolicyId(String appPolicyId) {
            this.appPolicyId = appPolicyId;
            return this;
        }
        public String getAppPolicyId() {
            return this.appPolicyId;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setApps(java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsApps> getApps() {
            return this.apps;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setChargeResourceMode(String chargeResourceMode) {
            this.chargeResourceMode = chargeResourceMode;
            return this;
        }
        public String getChargeResourceMode() {
            return this.chargeResourceMode;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setMaxAmount(Integer maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setMinAmount(Integer minAmount) {
            this.minAmount = minAmount;
            return this;
        }
        public Integer getMinAmount() {
            return this.minAmount;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setNodePool(java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool> nodePool) {
            this.nodePool = nodePool;
            return this;
        }
        public java.util.List<GetAppInstanceGroupResponseBodyAppInstanceGroupModelsNodePool> getNodePool() {
            return this.nodePool;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setOtaInfo(GetAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo otaInfo) {
            this.otaInfo = otaInfo;
            return this;
        }
        public GetAppInstanceGroupResponseBodyAppInstanceGroupModelsOtaInfo getOtaInfo() {
            return this.otaInfo;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setReserveAmountRatio(String reserveAmountRatio) {
            this.reserveAmountRatio = reserveAmountRatio;
            return this;
        }
        public String getReserveAmountRatio() {
            return this.reserveAmountRatio;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setReserveMaxAmount(Integer reserveMaxAmount) {
            this.reserveMaxAmount = reserveMaxAmount;
            return this;
        }
        public Integer getReserveMaxAmount() {
            return this.reserveMaxAmount;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setReserveMinAmount(Integer reserveMinAmount) {
            this.reserveMinAmount = reserveMinAmount;
            return this;
        }
        public Integer getReserveMinAmount() {
            return this.reserveMinAmount;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setScalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
            this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
            return this;
        }
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setScalingStep(Integer scalingStep) {
            this.scalingStep = scalingStep;
            return this;
        }
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setScalingUsageThreshold(String scalingUsageThreshold) {
            this.scalingUsageThreshold = scalingUsageThreshold;
            return this;
        }
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setSessionTimeout(String sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }
        public String getSessionTimeout() {
            return this.sessionTimeout;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setSkipUserAuthCheck(Boolean skipUserAuthCheck) {
            this.skipUserAuthCheck = skipUserAuthCheck;
            return this;
        }
        public Boolean getSkipUserAuthCheck() {
            return this.skipUserAuthCheck;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

        public GetAppInstanceGroupResponseBodyAppInstanceGroupModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
