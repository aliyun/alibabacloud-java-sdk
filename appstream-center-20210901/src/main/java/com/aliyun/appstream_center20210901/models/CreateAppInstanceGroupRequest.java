// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAppInstanceGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>img-8z4nztpaqvay4****</p>
     */
    @NameInMap("AppCenterImageId")
    public String appCenterImageId;

    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    @NameInMap("AppPackageType")
    public String appPackageType;

    @NameInMap("AppPolicyId")
    public String appPolicyId;

    /**
     * <strong>example:</strong>
     * <p>App</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthMode")
    public String authMode;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Node</p>
     */
    @NameInMap("ChargeResourceMode")
    public String chargeResourceMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Network")
    public CreateAppInstanceGroupRequestNetwork network;

    @NameInMap("NodePool")
    public CreateAppInstanceGroupRequestNodePool nodePool;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <strong>example:</strong>
     * <p>cag-b2ron*******</p>
     */
    @NameInMap("PreOpenAppId")
    public String preOpenAppId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("RuntimePolicy")
    public CreateAppInstanceGroupRequestRuntimePolicy runtimePolicy;

    @NameInMap("SecurityPolicy")
    public CreateAppInstanceGroupRequestSecurityPolicy securityPolicy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    @NameInMap("StoragePolicy")
    public CreateAppInstanceGroupRequestStoragePolicy storagePolicy;

    @NameInMap("SubPayType")
    public String subPayType;

    @NameInMap("UserDefinePolicy")
    public CreateAppInstanceGroupRequestUserDefinePolicy userDefinePolicy;

    @NameInMap("UserInfo")
    public CreateAppInstanceGroupRequestUserInfo userInfo;

    @NameInMap("Users")
    public java.util.List<String> users;

    @NameInMap("VideoPolicy")
    public CreateAppInstanceGroupRequestVideoPolicy videoPolicy;

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

    public CreateAppInstanceGroupRequest setAppPackageType(String appPackageType) {
        this.appPackageType = appPackageType;
        return this;
    }
    public String getAppPackageType() {
        return this.appPackageType;
    }

    public CreateAppInstanceGroupRequest setAppPolicyId(String appPolicyId) {
        this.appPolicyId = appPolicyId;
        return this;
    }
    public String getAppPolicyId() {
        return this.appPolicyId;
    }

    public CreateAppInstanceGroupRequest setAuthMode(String authMode) {
        this.authMode = authMode;
        return this;
    }
    public String getAuthMode() {
        return this.authMode;
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

    public CreateAppInstanceGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
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

    public CreateAppInstanceGroupRequest setSubPayType(String subPayType) {
        this.subPayType = subPayType;
        return this;
    }
    public String getSubPayType() {
        return this.subPayType;
    }

    public CreateAppInstanceGroupRequest setUserDefinePolicy(CreateAppInstanceGroupRequestUserDefinePolicy userDefinePolicy) {
        this.userDefinePolicy = userDefinePolicy;
        return this;
    }
    public CreateAppInstanceGroupRequestUserDefinePolicy getUserDefinePolicy() {
        return this.userDefinePolicy;
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

    public CreateAppInstanceGroupRequest setVideoPolicy(CreateAppInstanceGroupRequestVideoPolicy videoPolicy) {
        this.videoPolicy = videoPolicy;
        return this;
    }
    public CreateAppInstanceGroupRequestVideoPolicy getVideoPolicy() {
        return this.videoPolicy;
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
        /**
         * <strong>example:</strong>
         * <p>139.196.XX.XX/32</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <strong>example:</strong>
         * <p>Shared</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("IpExpireMinutes")
        public Integer ipExpireMinutes;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("Routes")
        public java.util.List<CreateAppInstanceGroupRequestNetworkRoutes> routes;

        /**
         * <strong>example:</strong>
         * <p>Shared</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

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

        public CreateAppInstanceGroupRequestNetwork setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
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

        public CreateAppInstanceGroupRequestNetwork setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class CreateAppInstanceGroupRequestNodePoolRecurrenceSchedulesTimerPeriods extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <strong>example:</strong>
         * <p>15:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>12:00</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>weekly</p>
         */
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
        @NameInMap("MaxIdleAppInstanceAmount")
        public Integer maxIdleAppInstanceAmount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        @NameInMap("RecurrenceSchedules")
        public java.util.List<CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules> recurrenceSchedules;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScalingStep")
        public Integer scalingStep;

        /**
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        /**
         * <strong>example:</strong>
         * <p>2022-09-08</p>
         */
        @NameInMap("StrategyDisableDate")
        public String strategyDisableDate;

        /**
         * <strong>example:</strong>
         * <p>2022-08-01</p>
         */
        @NameInMap("StrategyEnableDate")
        public String strategyEnableDate;

        /**
         * <strong>example:</strong>
         * <p>NODE_FIXED</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WarmUp")
        public Boolean warmUp;

        public static CreateAppInstanceGroupRequestNodePool build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestNodePool self = new CreateAppInstanceGroupRequestNodePool();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestNodePool setMaxIdleAppInstanceAmount(Integer maxIdleAppInstanceAmount) {
            this.maxIdleAppInstanceAmount = maxIdleAppInstanceAmount;
            return this;
        }
        public Integer getMaxIdleAppInstanceAmount() {
            return this.maxIdleAppInstanceAmount;
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

        @NameInMap("PerSessionPerApp")
        public Boolean perSessionPerApp;

        /**
         * <strong>example:</strong>
         * <p>DYNAMIC</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("PersistentAppInstanceScheduleMode")
        public String persistentAppInstanceScheduleMode;

        @NameInMap("SessionPreOpen")
        public String sessionPreOpen;

        /**
         * <p>会话类型。</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        @NameInMap("SessionUserGenerationMode")
        public String sessionUserGenerationMode;

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

        public CreateAppInstanceGroupRequestRuntimePolicy setPerSessionPerApp(Boolean perSessionPerApp) {
            this.perSessionPerApp = perSessionPerApp;
            return this;
        }
        public Boolean getPerSessionPerApp() {
            return this.perSessionPerApp;
        }

        public CreateAppInstanceGroupRequestRuntimePolicy setPersistentAppInstanceScheduleMode(String persistentAppInstanceScheduleMode) {
            this.persistentAppInstanceScheduleMode = persistentAppInstanceScheduleMode;
            return this;
        }
        public String getPersistentAppInstanceScheduleMode() {
            return this.persistentAppInstanceScheduleMode;
        }

        public CreateAppInstanceGroupRequestRuntimePolicy setSessionPreOpen(String sessionPreOpen) {
            this.sessionPreOpen = sessionPreOpen;
            return this;
        }
        public String getSessionPreOpen() {
            return this.sessionPreOpen;
        }

        public CreateAppInstanceGroupRequestRuntimePolicy setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public CreateAppInstanceGroupRequestRuntimePolicy setSessionUserGenerationMode(String sessionUserGenerationMode) {
            this.sessionUserGenerationMode = sessionUserGenerationMode;
            return this;
        }
        public String getSessionUserGenerationMode() {
            return this.sessionUserGenerationMode;
        }

    }

    public static class CreateAppInstanceGroupRequestSecurityPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResetAfterUnbind")
        public Boolean resetAfterUnbind;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
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

    public static class CreateAppInstanceGroupRequestStoragePolicyUserProfile extends TeaModel {
        @NameInMap("RemoteStoragePath")
        public String remoteStoragePath;

        @NameInMap("RemoteStorageType")
        public String remoteStorageType;

        @NameInMap("UserProfileSwitch")
        public Boolean userProfileSwitch;

        public static CreateAppInstanceGroupRequestStoragePolicyUserProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestStoragePolicyUserProfile self = new CreateAppInstanceGroupRequestStoragePolicyUserProfile();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestStoragePolicyUserProfile setRemoteStoragePath(String remoteStoragePath) {
            this.remoteStoragePath = remoteStoragePath;
            return this;
        }
        public String getRemoteStoragePath() {
            return this.remoteStoragePath;
        }

        public CreateAppInstanceGroupRequestStoragePolicyUserProfile setRemoteStorageType(String remoteStorageType) {
            this.remoteStorageType = remoteStorageType;
            return this;
        }
        public String getRemoteStorageType() {
            return this.remoteStorageType;
        }

        public CreateAppInstanceGroupRequestStoragePolicyUserProfile setUserProfileSwitch(Boolean userProfileSwitch) {
            this.userProfileSwitch = userProfileSwitch;
            return this;
        }
        public Boolean getUserProfileSwitch() {
            return this.userProfileSwitch;
        }

    }

    public static class CreateAppInstanceGroupRequestStoragePolicy extends TeaModel {
        @NameInMap("StorageTypeList")
        public java.util.List<String> storageTypeList;

        @NameInMap("UserProfile")
        public CreateAppInstanceGroupRequestStoragePolicyUserProfile userProfile;

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

        public CreateAppInstanceGroupRequestStoragePolicy setUserProfile(CreateAppInstanceGroupRequestStoragePolicyUserProfile userProfile) {
            this.userProfile = userProfile;
            return this;
        }
        public CreateAppInstanceGroupRequestStoragePolicyUserProfile getUserProfile() {
            return this.userProfile;
        }

    }

    public static class CreateAppInstanceGroupRequestUserDefinePolicy extends TeaModel {
        @NameInMap("CustomConfig")
        public String customConfig;

        public static CreateAppInstanceGroupRequestUserDefinePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestUserDefinePolicy self = new CreateAppInstanceGroupRequestUserDefinePolicy();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestUserDefinePolicy setCustomConfig(String customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public String getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class CreateAppInstanceGroupRequestUserInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Simple</p>
         */
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

    public static class CreateAppInstanceGroupRequestVideoPolicy extends TeaModel {
        @NameInMap("FrameRate")
        public Integer frameRate;

        @NameInMap("SessionResolutionHeight")
        public Integer sessionResolutionHeight;

        @NameInMap("SessionResolutionWidth")
        public Integer sessionResolutionWidth;

        @NameInMap("StreamingMode")
        public String streamingMode;

        @NameInMap("TerminalResolutionAdaptive")
        public Boolean terminalResolutionAdaptive;

        @NameInMap("Webrtc")
        public Boolean webrtc;

        public static CreateAppInstanceGroupRequestVideoPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupRequestVideoPolicy self = new CreateAppInstanceGroupRequestVideoPolicy();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupRequestVideoPolicy setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public CreateAppInstanceGroupRequestVideoPolicy setSessionResolutionHeight(Integer sessionResolutionHeight) {
            this.sessionResolutionHeight = sessionResolutionHeight;
            return this;
        }
        public Integer getSessionResolutionHeight() {
            return this.sessionResolutionHeight;
        }

        public CreateAppInstanceGroupRequestVideoPolicy setSessionResolutionWidth(Integer sessionResolutionWidth) {
            this.sessionResolutionWidth = sessionResolutionWidth;
            return this;
        }
        public Integer getSessionResolutionWidth() {
            return this.sessionResolutionWidth;
        }

        public CreateAppInstanceGroupRequestVideoPolicy setStreamingMode(String streamingMode) {
            this.streamingMode = streamingMode;
            return this;
        }
        public String getStreamingMode() {
            return this.streamingMode;
        }

        public CreateAppInstanceGroupRequestVideoPolicy setTerminalResolutionAdaptive(Boolean terminalResolutionAdaptive) {
            this.terminalResolutionAdaptive = terminalResolutionAdaptive;
            return this;
        }
        public Boolean getTerminalResolutionAdaptive() {
            return this.terminalResolutionAdaptive;
        }

        public CreateAppInstanceGroupRequestVideoPolicy setWebrtc(Boolean webrtc) {
            this.webrtc = webrtc;
            return this;
        }
        public Boolean getWebrtc() {
            return this.webrtc;
        }

    }

}
