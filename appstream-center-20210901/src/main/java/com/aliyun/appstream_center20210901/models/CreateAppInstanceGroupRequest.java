// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAppInstanceGroupRequest extends TeaModel {
    @NameInMap("AppCenterImageId")
    public String appCenterImageId;

    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("ChargeResourceMode")
    public String chargeResourceMode;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Network")
    public CreateAppInstanceGroupRequestNetwork network;

    @NameInMap("NodePool")
    public CreateAppInstanceGroupRequestNodePool nodePool;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PreOpenAppId")
    public String preOpenAppId;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("RuntimePolicy")
    public CreateAppInstanceGroupRequestRuntimePolicy runtimePolicy;

    @NameInMap("SecurityPolicy")
    public CreateAppInstanceGroupRequestSecurityPolicy securityPolicy;

    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    @NameInMap("StoragePolicy")
    public CreateAppInstanceGroupRequestStoragePolicy storagePolicy;

    @NameInMap("UserInfo")
    public CreateAppInstanceGroupRequestUserInfo userInfo;

    @NameInMap("Users")
    public java.util.List<String> users;

    public static CreateAppInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceGroupRequest self = new CreateAppInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceGroupRequest setAppCenterImageId(String appCenterImageId) {
        this.appCenterImageId = appCenterImageId;
        return this;
    }
    public String getAppCenterImageId() {
        return this.appCenterImageId;
    }

    public CreateAppInstanceGroupRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public CreateAppInstanceGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateAppInstanceGroupRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateAppInstanceGroupRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateAppInstanceGroupRequest setChargeResourceMode(String chargeResourceMode) {
        this.chargeResourceMode = chargeResourceMode;
        return this;
    }
    public String getChargeResourceMode() {
        return this.chargeResourceMode;
    }

    public CreateAppInstanceGroupRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateAppInstanceGroupRequest setNetwork(CreateAppInstanceGroupRequestNetwork network) {
        this.network = network;
        return this;
    }
    public CreateAppInstanceGroupRequestNetwork getNetwork() {
        return this.network;
    }

    public CreateAppInstanceGroupRequest setNodePool(CreateAppInstanceGroupRequestNodePool nodePool) {
        this.nodePool = nodePool;
        return this;
    }
    public CreateAppInstanceGroupRequestNodePool getNodePool() {
        return this.nodePool;
    }

    public CreateAppInstanceGroupRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateAppInstanceGroupRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateAppInstanceGroupRequest setPreOpenAppId(String preOpenAppId) {
        this.preOpenAppId = preOpenAppId;
        return this;
    }
    public String getPreOpenAppId() {
        return this.preOpenAppId;
    }

    public CreateAppInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateAppInstanceGroupRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateAppInstanceGroupRequest setRuntimePolicy(CreateAppInstanceGroupRequestRuntimePolicy runtimePolicy) {
        this.runtimePolicy = runtimePolicy;
        return this;
    }
    public CreateAppInstanceGroupRequestRuntimePolicy getRuntimePolicy() {
        return this.runtimePolicy;
    }

    public CreateAppInstanceGroupRequest setSecurityPolicy(CreateAppInstanceGroupRequestSecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }
    public CreateAppInstanceGroupRequestSecurityPolicy getSecurityPolicy() {
        return this.securityPolicy;
    }

    public CreateAppInstanceGroupRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public CreateAppInstanceGroupRequest setStoragePolicy(CreateAppInstanceGroupRequestStoragePolicy storagePolicy) {
        this.storagePolicy = storagePolicy;
        return this;
    }
    public CreateAppInstanceGroupRequestStoragePolicy getStoragePolicy() {
        return this.storagePolicy;
    }

    public CreateAppInstanceGroupRequest setUserInfo(CreateAppInstanceGroupRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CreateAppInstanceGroupRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public CreateAppInstanceGroupRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public static class CreateAppInstanceGroupRequestNetworkDomainRules extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Policy")
        public String policy;

        public static CreateAppInstanceGroupRequestNetworkDomainRules build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestNetworkDomainRules self = new CreateAppInstanceGroupRequestNetworkDomainRules();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestNetworkDomainRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateAppInstanceGroupRequestNetworkDomainRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class CreateAppInstanceGroupRequestNetworkRoutes extends TeaModel {
        @NameInMap("Destination")
        public String destination;

        @NameInMap("Mode")
        public String mode;

        public static CreateAppInstanceGroupRequestNetworkRoutes build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestNetworkRoutes self = new CreateAppInstanceGroupRequestNetworkRoutes();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestNetworkRoutes setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public CreateAppInstanceGroupRequestNetworkRoutes setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class CreateAppInstanceGroupRequestNetwork extends TeaModel {
        @NameInMap("DomainRules")
        public java.util.List<CreateAppInstanceGroupRequestNetworkDomainRules> domainRules;

        @NameInMap("IpExpireMinutes")
        public Integer ipExpireMinutes;

        @NameInMap("Routes")
        public java.util.List<CreateAppInstanceGroupRequestNetworkRoutes> routes;

        @NameInMap("StrategyType")
        public String strategyType;

        public static CreateAppInstanceGroupRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestNetwork self = new CreateAppInstanceGroupRequestNetwork();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestNetwork setDomainRules(java.util.List<CreateAppInstanceGroupRequestNetworkDomainRules> domainRules) {
            this.domainRules = domainRules;
            return this;
        }
        public java.util.List<CreateAppInstanceGroupRequestNetworkDomainRules> getDomainRules() {
            return this.domainRules;
        }

        public CreateAppInstanceGroupRequestNetwork setIpExpireMinutes(Integer ipExpireMinutes) {
            this.ipExpireMinutes = ipExpireMinutes;
            return this;
        }
        public Integer getIpExpireMinutes() {
            return this.ipExpireMinutes;
        }

        public CreateAppInstanceGroupRequestNetwork setRoutes(java.util.List<CreateAppInstanceGroupRequestNetworkRoutes> routes) {
            this.routes = routes;
            return this;
        }
        public java.util.List<CreateAppInstanceGroupRequestNetworkRoutes> getRoutes() {
            return this.routes;
        }

        public CreateAppInstanceGroupRequestNetwork setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

    }

    public static class CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods self = new CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules extends TeaModel {
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValues")
        public java.util.List<Integer> recurrenceValues;

        @NameInMap("TimerPeriods")
        public java.util.List<CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods> timerPeriods;

        public static CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules self = new CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules setRecurrenceValues(java.util.List<Integer> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }
        public java.util.List<Integer> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        public CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules setTimerPeriods(java.util.List<CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods> timerPeriods) {
            this.timerPeriods = timerPeriods;
            return this;
        }
        public java.util.List<CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods> getTimerPeriods() {
            return this.timerPeriods;
        }

    }

    public static class CreateAppInstanceGroupRequestNodePool extends TeaModel {
        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        @NameInMap("RecurrenceSchedules")
        public java.util.List<CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules> recurrenceSchedules;

        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

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

        public static CreateAppInstanceGroupRequestNodePool build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestNodePool self = new CreateAppInstanceGroupRequestNodePool();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestNodePool setMaxScalingAmount(Integer maxScalingAmount) {
            this.maxScalingAmount = maxScalingAmount;
            return this;
        }
        public Integer getMaxScalingAmount() {
            return this.maxScalingAmount;
        }

        public CreateAppInstanceGroupRequestNodePool setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public CreateAppInstanceGroupRequestNodePool setNodeCapacity(Integer nodeCapacity) {
            this.nodeCapacity = nodeCapacity;
            return this;
        }
        public Integer getNodeCapacity() {
            return this.nodeCapacity;
        }

        public CreateAppInstanceGroupRequestNodePool setNodeInstanceType(String nodeInstanceType) {
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        public CreateAppInstanceGroupRequestNodePool setRecurrenceSchedules(java.util.List<CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules> recurrenceSchedules) {
            this.recurrenceSchedules = recurrenceSchedules;
            return this;
        }
        public java.util.List<CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules> getRecurrenceSchedules() {
            return this.recurrenceSchedules;
        }

        public CreateAppInstanceGroupRequestNodePool setScalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
            this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
            return this;
        }
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        public CreateAppInstanceGroupRequestNodePool setScalingStep(Integer scalingStep) {
            this.scalingStep = scalingStep;
            return this;
        }
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        public CreateAppInstanceGroupRequestNodePool setScalingUsageThreshold(String scalingUsageThreshold) {
            this.scalingUsageThreshold = scalingUsageThreshold;
            return this;
        }
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        public CreateAppInstanceGroupRequestNodePool setStrategyDisableDate(String strategyDisableDate) {
            this.strategyDisableDate = strategyDisableDate;
            return this;
        }
        public String getStrategyDisableDate() {
            return this.strategyDisableDate;
        }

        public CreateAppInstanceGroupRequestNodePool setStrategyEnableDate(String strategyEnableDate) {
            this.strategyEnableDate = strategyEnableDate;
            return this;
        }
        public String getStrategyEnableDate() {
            return this.strategyEnableDate;
        }

        public CreateAppInstanceGroupRequestNodePool setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

        public CreateAppInstanceGroupRequestNodePool setWarmUp(Boolean warmUp) {
            this.warmUp = warmUp;
            return this;
        }
        public Boolean getWarmUp() {
            return this.warmUp;
        }

    }

    public static class CreateAppInstanceGroupRequestRuntimePolicy extends TeaModel {
        @NameInMap("DebugMode")
        public String debugMode;

        /**
         * <p>会话类型。</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        public static CreateAppInstanceGroupRequestRuntimePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestRuntimePolicy self = new CreateAppInstanceGroupRequestRuntimePolicy();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestRuntimePolicy setDebugMode(String debugMode) {
            this.debugMode = debugMode;
            return this;
        }
        public String getDebugMode() {
            return this.debugMode;
        }

        public CreateAppInstanceGroupRequestRuntimePolicy setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

    }

    public static class CreateAppInstanceGroupRequestSecurityPolicy extends TeaModel {
        @NameInMap("ResetAfterUnbind")
        public Boolean resetAfterUnbind;

        @NameInMap("SkipUserAuthCheck")
        public Boolean skipUserAuthCheck;

        public static CreateAppInstanceGroupRequestSecurityPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestSecurityPolicy self = new CreateAppInstanceGroupRequestSecurityPolicy();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestSecurityPolicy setResetAfterUnbind(Boolean resetAfterUnbind) {
            this.resetAfterUnbind = resetAfterUnbind;
            return this;
        }
        public Boolean getResetAfterUnbind() {
            return this.resetAfterUnbind;
        }

        public CreateAppInstanceGroupRequestSecurityPolicy setSkipUserAuthCheck(Boolean skipUserAuthCheck) {
            this.skipUserAuthCheck = skipUserAuthCheck;
            return this;
        }
        public Boolean getSkipUserAuthCheck() {
            return this.skipUserAuthCheck;
        }

    }

    public static class CreateAppInstanceGroupRequestStoragePolicy extends TeaModel {
        @NameInMap("StorageTypeList")
        public java.util.List<String> storageTypeList;

        public static CreateAppInstanceGroupRequestStoragePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestStoragePolicy self = new CreateAppInstanceGroupRequestStoragePolicy();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestStoragePolicy setStorageTypeList(java.util.List<String> storageTypeList) {
            this.storageTypeList = storageTypeList;
            return this;
        }
        public java.util.List<String> getStorageTypeList() {
            return this.storageTypeList;
        }

    }

    public static class CreateAppInstanceGroupRequestUserInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        public static CreateAppInstanceGroupRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestUserInfo self = new CreateAppInstanceGroupRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestUserInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
