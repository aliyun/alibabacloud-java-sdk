// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAppInstanceGroupRequest extends TeaModel {
    /**
     * <p>The application image ID. You can obtain the ID from the <strong>O&amp;M</strong> &gt; <strong>Custom Images</strong> or <strong>System Images</strong> page in the <a href="https://appstreaming.console.aliyun.com/">WUYING Cloud Application console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>img-8z4nztpaqvay4****</p>
     */
    @NameInMap("AppCenterImageId")
    public String appCenterImageId;

    /**
     * <p>The name of the delivery group.</p>
     * 
     * <strong>example:</strong>
     * <p>办公应用</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The package type.</p>
     * 
     * <strong>example:</strong>
     * <p>browser.package.5.250.appstreaming.general.basic</p>
     */
    @NameInMap("AppPackageType")
    public String appPackageType;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-0clfzcy0adpcf****</p>
     */
    @NameInMap("AppPolicyId")
    public String appPolicyId;

    /**
     * <p>The authorization mode of the delivery group.</p>
     * 
     * <strong>example:</strong>
     * <p>App</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthMode")
    public String authMode;

    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The region ID of the delivery group. For information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The sales mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Node</p>
     */
    @NameInMap("ChargeResourceMode")
    public String chargeResourceMode;

    /**
     * <p>The billing method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cls-d39iq73l5c0a8****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The network configuration.</p>
     * <blockquote>
     * <p>To use this parameter, submit a ticket.</p>
     * </blockquote>
     */
    @NameInMap("Network")
    public CreateAppInstanceGroupRequestNetwork network;

    /**
     * <p>The node pool object.</p>
     */
    @NameInMap("NodePool")
    public CreateAppInstanceGroupRequestNodePool nodePool;

    /**
     * <p>The subscription duration of the resource when <code>ChargeType</code> is set to <code>PrePaid</code>. This parameter is required. The unit is specified by <code>PeriodUnit</code>.</p>
     * <ul>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Week</code>, valid values:</p>
     * <ul>
     * <li>1</li>
     * </ul>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>6</li>
     * </ul>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If <code>ChargeType</code> is set to <code>PostPaid</code>, set this parameter to 1.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration when <code>ChargeType</code> is set to <code>PrePaid</code>.</p>
     * <blockquote>
     * <p>This parameter is case-sensitive. For example, <code>Week</code> is valid, but <code>week</code> is invalid.
     * If the request parameters do not match the valid combinations, such as <code>2 Week</code>, the API call succeeds but an error occurs during the order placement.</p>
     * </blockquote>
     * <blockquote>
     * <p>If <code>ChargeType</code> is set to <code>PostPaid</code>, set this parameter to <code>Month</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The pre-opened application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cag-b2ronxxd****</p>
     */
    @NameInMap("PreOpenAppId")
    public String preOpenAppId;

    /**
     * <p>The product type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The promotion ID. You can call the <a href="https://help.aliyun.com/document_detail/428503.html">GetResourcePrice</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The runtime policy.</p>
     */
    @NameInMap("RuntimePolicy")
    public CreateAppInstanceGroupRequestRuntimePolicy runtimePolicy;

    /**
     * <p>The security policy.</p>
     */
    @NameInMap("SecurityPolicy")
    public CreateAppInstanceGroupRequestSecurityPolicy securityPolicy;

    /**
     * <p>The application recycling timeout period, in minutes. After an end user disconnects from a cloud application for a period of time, the cloud application process exits. This period is the application recycling timeout. Set this parameter to <code>-1</code> if you do not want the application to be recycled. Valid values: -1 and 3 to 300 (integer). Default value: <code>15</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <p>The storage policy.</p>
     */
    @NameInMap("StoragePolicy")
    public CreateAppInstanceGroupRequestStoragePolicy storagePolicy;

    /**
     * <p>The billing method subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>postPaid</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    /**
     * <p>The user-defined policy.</p>
     */
    @NameInMap("UserDefinePolicy")
    public CreateAppInstanceGroupRequestUserDefinePolicy userDefinePolicy;

    /**
     * <p>The list of authorized user group IDs.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The user information of the users to be added to the delivery group. This field is required if the <code>Users</code> parameter is specified.</p>
     */
    @NameInMap("UserInfo")
    public CreateAppInstanceGroupRequestUserInfo userInfo;

    /**
     * <p>The list of usernames to be added to the delivery group as assigned users.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    /**
     * <p>The display policy.</p>
     */
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

    public CreateAppInstanceGroupRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
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
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The policy value.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
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
         * <p>The access destination. CIDR format.</p>
         * 
         * <strong>example:</strong>
         * <p>139.196.XX.XX/32</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The network egress mode.</p>
         * 
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
        /**
         * <p>The domain name rule configurations.</p>
         */
        @NameInMap("DomainRules")
        public java.util.List<CreateAppInstanceGroupRequestNetworkDomainRules> domainRules;

        /**
         * <p>The duration (in minutes) after which the public IP address is refreshed upon the next logon. Minimum value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("IpExpireMinutes")
        public Integer ipExpireMinutes;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong+dir-842567****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The route configurations. This parameter can be configured only when the network policy type (<code>StrategyType</code>) is set to mixed mode (<code>Mixed</code>).</p>
         */
        @NameInMap("Routes")
        public java.util.List<CreateAppInstanceGroupRequestNetworkRoutes> routes;

        /**
         * <p>The network policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>Shared</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <p>The list of vSwitch IDs.</p>
         * <ul>
         * <li>Valid only for custom office networks.</li>
         * </ul>
         */
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
         * <p>The resource count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The end time. Format: HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>15:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time. Format: HH:mm.</p>
         * 
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
         * <p>The type of the recurrence schedule. You must specify both <code>RecurrenceType</code> and <code>RecurrenceValues</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The list of recurrence values.</p>
         */
        @NameInMap("RecurrenceValues")
        public java.util.List<Integer> recurrenceValues;

        /**
         * <p>The list of time periods for the recurrence schedule. Requirements for time period settings:</p>
         * <ul>
         * <li>You can add up to 3 time periods.</li>
         * <li>Time periods must not overlap.</li>
         * <li>The interval between time periods must be at least 5 minutes.</li>
         * <li>Each time period must be at least 15 minutes long.</li>
         * <li>All time periods combined must not span across days.</li>
         * </ul>
         */
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
        /**
         * <p>The maximum number of idle sessions. When this value is specified, auto scale-out is triggered only when the session usage exceeds <code>ScalingUsageThreshold</code> and the number of idle sessions in the current delivery group is less than <code>MaxIdleAppInstanceAmount</code>. Otherwise, the idle sessions are considered sufficient and no auto scale-out is performed. This parameter allows you to flexibly control elastic scaling behavior and reduce costs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxIdleAppInstanceAmount")
        public Integer maxIdleAppInstanceAmount;

        /**
         * <p>The maximum number of resources that can be created during scale-out. This field is required when <code>StrategyType</code> is set to <code>NODE_SCALING_BY_USAGE</code> (elastic resources).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        /**
         * <p>The number of resources to purchase. Valid values: 1 to 100.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required for subscription resources.</li>
         * <li>This parameter is required for pay-as-you-go resources when the scaling mode (<code>StrategyType</code>) is set to fixed quantity (<code>NODE_FIXED</code>) or auto scaling (<code>NODE_SCALING_BY_USAGE</code>).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The number of concurrent sessions, which is the number of sessions that a single resource can handle simultaneously. Too many concurrent sessions may degrade the application experience. The valid value range varies by resource specification. You can call the ListNodeInstanceType operation to obtain the valid value range for each resource specification.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

        /**
         * <p>The instance type ID of the resource to purchase. You can call the <a href="https://help.aliyun.com/document_detail/428502.html">ListNodeInstanceType</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.general.4c8g</p>
         */
        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        /**
         * <p>The list of recurrence schedules. This field is required when <code>StrategyType</code> (scaling mode) is set to <code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling).</p>
         */
        @NameInMap("RecurrenceSchedules")
        public java.util.List<CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules> recurrenceSchedules;

        /**
         * <p>The maximum duration (in minutes) that a resource without active sessions is retained. When no sessions are connected to a resource, a countdown starts based on this value. The resource is released when the countdown ends. Valid values: 5 to 120. Default value: 5. The following exceptions apply:</p>
         * <ul>
         * <li>If releasing the resource would trigger auto scale-out again, the scale-down is not performed to avoid repeated scaling operations.</li>
         * <li>If auto scale-out is triggered due to increased sessions during this period, the resource is not released as originally planned, and the countdown restarts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        /**
         * <p>The number of resources to create per scale-out operation. Valid values: 1 to 10. This field is required when <code>StrategyType</code> is set to <code>NODE_SCALING_BY_USAGE</code> (elastic resources).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScalingStep")
        public Integer scalingStep;

        /**
         * <p>The upper threshold of session usage (%). Auto scale-out is triggered when the session usage exceeds this threshold. The session usage is calculated as follows: <code>Session usage = Current sessions ÷ (Total resources × Concurrent sessions per resource) × 100%</code>. This field is required when <code>StrategyType</code> is set to <code>NODE_SCALING_BY_USAGE</code> (elastic resources). Valid values: 0 to 100. Default value: 85.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        /**
         * <p>The date when the policy expires. Format: yyyy-MM-dd. The interval between the expiration date and the effective date must be between 7 days and 1 year, inclusive. This field is required when <code>StrategyType</code> (scaling mode) is set to <code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08</p>
         */
        @NameInMap("StrategyDisableDate")
        public String strategyDisableDate;

        /**
         * <p>The date when the policy takes effect. Format: yyyy-MM-dd. The date must be equal to or later than the current date. This field is required when <code>StrategyType</code> (scaling mode) is set to <code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01</p>
         */
        @NameInMap("StrategyEnableDate")
        public String strategyEnableDate;

        /**
         * <p>The scaling mode.</p>
         * <blockquote>
         * <ul>
         * <li><code>NODE_FIXED</code> (fixed quantity): applicable to subscription and pay-as-you-go resources.</li>
         * <li><code>NODE_SCALING_BY_USAGE</code> (auto scaling): applicable to subscription and pay-as-you-go resources.</li>
         * <li><code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling): applicable only to pay-as-you-go resources.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NODE_FIXED</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <p>Specifies whether to enable the resource prefetch policy. This field is required when <code>StrategyType</code> (scaling mode) is set to <code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling).</p>
         * 
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
        /**
         * <p>Specifies whether to enable debug mode. To call <code>GetDebugAppInstance</code> and <code>CreateImageFromAppInstanceGroup</code>, set this field to <code>ON</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        @NameInMap("DebugMode")
        public String debugMode;

        /**
         * <p>Specifies whether to allow only one application per session.</p>
         * <ul>
         * <li>When enabled, opening multiple applications in the delivery group allocates a separate session for each application, consuming more sessions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PerSessionPerApp")
        public Boolean perSessionPerApp;

        /**
         * <p>The scheduling mode for persistent sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>DYNAMIC</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("PersistentAppInstanceScheduleMode")
        public String persistentAppInstanceScheduleMode;

        /**
         * <p>Specifies whether to enable session pre-opening.</p>
         * <ul>
         * <li>If not specified, the default value is true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SessionPreOpen")
        public String sessionPreOpen;

        /**
         * <p>The session type.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        /**
         * <p>The generation mode for session users.</p>
         * <ul>
         * <li>wyid: The session pre-open (SessionPreOpen) must be set to false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wyid</p>
         */
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
         * <p>Specifies whether to reset after unbinding.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResetAfterUnbind")
        public Boolean resetAfterUnbind;

        /**
         * <p>Specifies whether to skip user authorization verification.</p>
         * 
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
        /**
         * <p>The remote storage path for user data roaming.</p>
         * <ul>
         * <li>If not specified, the default value is the delivery group ID.</li>
         * <li>For cross-delivery-group (same VPC) user data roaming, set the same value for all delivery groups involved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ID20250101</p>
         */
        @NameInMap("RemoteStoragePath")
        public String remoteStoragePath;

        /**
         * <p>The remote storage type used for user data roaming.</p>
         * 
         * <strong>example:</strong>
         * <p>NAS</p>
         */
        @NameInMap("RemoteStorageType")
        public String remoteStorageType;

        /**
         * <p>Specifies whether to enable user data roaming.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>The list of storage types.</p>
         */
        @NameInMap("StorageTypeList")
        public java.util.List<String> storageTypeList;

        /**
         * <p>The user data roaming configuration.</p>
         */
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
        /**
         * <p>The custom policy content. The content must comply with the image version specifications. To use this parameter, submit a ticket to enable the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;target&quot;:&quot;agent&quot;,&quot;config&quot;:{&quot;abc&quot;:&quot;xxx&quot;}}]</p>
         */
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
         * <p>The user account type.</p>
         * 
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
        /**
         * <p>The frame rate (FPS).</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("FrameRate")
        public Integer frameRate;

        /**
         * <p>The height of the resolution, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("SessionResolutionHeight")
        public Integer sessionResolutionHeight;

        /**
         * <p>The width of the resolution, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("SessionResolutionWidth")
        public Integer sessionResolutionWidth;

        /**
         * <p>The streaming mode. Used together with the <code>Webrtc</code> parameter to specify the protocol type.</p>
         * <ul>
         * <li><code>Webrtc</code>=<code>true</code> and <code>StreamingMode</code>=<code>video</code>: WebRTC streaming.</li>
         * <li><code>Webrtc</code>=<code>false</code> and <code>StreamingMode</code>=<code>video</code>: video streaming.</li>
         * <li><code>Webrtc</code>=<code>false</code> and <code>StreamingMode</code>=<code>mix</code>: mixed streaming.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("StreamingMode")
        public String streamingMode;

        /**
         * <p>Specifies whether to use adaptive resolution.</p>
         * <ul>
         * <li><p><code>true</code>: The session resolution follows the terminal display area. In this case, <code>SessionResolutionWidth</code> and <code>SessionResolutionHeight</code> specify the maximum resolution values.</p>
         * </li>
         * <li><p><code>false</code>: The session resolution does not follow the terminal display area. In this case, the resolution is fixed to the values of <code>SessionResolutionWidth</code> and <code>SessionResolutionHeight</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TerminalResolutionAdaptive")
        public Boolean terminalResolutionAdaptive;

        /**
         * <p>Specifies whether to enable WebRTC. Used together with the <code>StreamingMode</code> parameter to specify the protocol type.</p>
         * <ul>
         * <li><code>Webrtc</code>=<code>true</code> and <code>StreamingMode</code>=<code>video</code>: WebRTC streaming.</li>
         * <li><code>Webrtc</code>=<code>false</code> and <code>StreamingMode</code>=<code>video</code>: video streaming.</li>
         * <li><code>Webrtc</code>=<code>false</code> and <code>StreamingMode</code>=<code>mix</code>: mixed streaming.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
