// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAppInstanceGroupRequest extends TeaModel {
    /**
     * <p>The image ID of the application. To obtain the image ID, log on to the <a href="https://appstreaming.console.aliyun.com/">App Streaming console</a>. In the left-side navigation pane, choose <strong>Maintenance</strong> &gt; <strong>Custom Images</strong> or Maintenance &gt; <strong>System Images</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>img-8z4nztpaqvay4****</p>
     */
    @NameInMap("AppCenterImageId")
    public String appCenterImageId;

    /**
     * <p>The name of the delivery group.</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>Package type.</p>
     * 
     * <strong>example:</strong>
     * <p>browser.package.5.250.appstreaming.general.basic</p>
     */
    @NameInMap("AppPackageType")
    public String appPackageType;

    /**
     * <p>Policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-0clfzcy0adpcf****</p>
     */
    @NameInMap("AppPolicyId")
    public String appPolicyId;

    /**
     * <p>The authentication mode of the delivery group.</p>
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
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false: manual payment. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false: manual payment. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The ID of the region where the delivery group resides. For information about the supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cn-shanghai: China (Shanghai)</li>
     * <li>cn-hangzhou: China (Hangzhou)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The sales mode.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>Node: by resource</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Node</p>
     */
    @NameInMap("ChargeResourceMode")
    public String chargeResourceMode;

    /**
     * <p>The billing method.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PostPaid: pay-as-you-go</li>
     * <li>PrePaid: subscription</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cls-d39iq73l5c0a8****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The network settings.</p>
     * <blockquote>
     * <p> If you want to use this parameter, submit a ticket.</p>
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
     * <p>The subscription duration of resources. This parameter is required if you set <code>ChargeType</code> to <code>PrePaid</code>. The unit of this parameter is specified by <code>PeriodUnit</code>.</p>
     * <ul>
     * <li><p>Valid value if you set <code>PeriodUnit</code> to <code>Week</code>:</p>
     * <ul>
     * <li>1</li>
     * </ul>
     * </li>
     * <li><p>Valid values if you set <code>PeriodUnit</code> to <code>Month</code>:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>6</li>
     * </ul>
     * </li>
     * <li><p>Valid values if you set <code>PeriodUnit</code> to <code>Year</code>:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> If you set <code>ChargeType</code> to <code>PostPaid</code>, set this parameter to 1.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. This parameter is available if you set <code>ChargeType</code> to <code>PrePaid</code>.</p>
     * <blockquote>
     * <p> The value of this parameter is case-insensitive. For example, <code>Week</code> is valid and <code>week</code> is invalid. If you specify an invalid value combination for Period and PeriodUnit, such as <code>2 Week</code>, the operation can still be called. However, an error occurs when you place the order.</p>
     * </blockquote>
     * <blockquote>
     * <p> If you set <code>ChargeType</code> to <code>PostPaid</code>, set this parameter to <code>Month</code>.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * <li>Week</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the pre-open application.</p>
     * 
     * <strong>example:</strong>
     * <p>cag-b2ron*******</p>
     */
    @NameInMap("PreOpenAppId")
    public String preOpenAppId;

    /**
     * <p>The product type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * </ul>
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
     * <p>The period of time during which the application can be recycled. The recycling period is the period of time between the time when the end user disconnects from the application and the time when processes exit the application. If you do not want to recycle the application, set this parameter to <code>-1</code>. Valid values:-1 and 3 to 300. The value must be an integer. Default value: <code>15</code>. Unit: minutes.</p>
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
     * <p>Payment method subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>postPaid</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    /**
     * <p>The custom policy.</p>
     */
    @NameInMap("UserDefinePolicy")
    public CreateAppInstanceGroupRequestUserDefinePolicy userDefinePolicy;

    /**
     * <p>List of authorized user group IDs.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The information about the user that you want to add to the assigned user list of the delivery group. This parameter is required if you configure <code>Users</code>.</p>
     */
    @NameInMap("UserInfo")
    public CreateAppInstanceGroupRequestUserInfo userInfo;

    /**
     * <p>The users that you want to add to the assigned user list of the delivery group.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    /**
     * <p>Display policy.</p>
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
         * <p>The policy used for the domain name.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>allow</li>
         * <li>block</li>
         * </ul>
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
         * <p>The destination. The value is a CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>139.196.XX.XX/32</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The network egress mode.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Shared: accesses the network by using NAT Gateway.</li>
         * </ul>
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
         * <p>The domain name rules.</p>
         */
        @NameInMap("DomainRules")
        public java.util.List<CreateAppInstanceGroupRequestNetworkDomainRules> domainRules;

        /**
         * <p>The validity period of the public IP address. If the specified value is exceeded, the IP address is updated at next logon. Minimum value: 60. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("IpExpireMinutes")
        public Integer ipExpireMinutes;

        /**
         * <p>Office Network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong+dir-842567****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The route settings. This parameter is available only if you set <code>StrategyType</code> to <code>Mixed</code>.</p>
         */
        @NameInMap("Routes")
        public java.util.List<CreateAppInstanceGroupRequestNetworkRoutes> routes;

        /**
         * <p>The type of the network policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Mixed: the hybrid mode. In this mode, a device is deployed in one virtual private cloud (VPC). Two NICs are provided and an independent public IP address is configured for the device.</li>
         * <li>Shared: the shared mode. In this mode, a single NIC is provided for a device and the network is accessed by using NAT Gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Shared</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <p>List of virtual switch IDs.</p>
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
         * <p>The number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The end time of the time period. Format: HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>15:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of the time period. Format: HH:mm.</p>
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
         * <p>The schedule type of the scaling policy. This parameter must be configured together with <code>RecurrenceValues</code>.``</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Weekly: The scaling policy is executed on specific days each week.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>weekly</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The days of each week on which the scaling policy is executed.</p>
         */
        @NameInMap("RecurrenceValues")
        public java.util.List<Integer> recurrenceValues;

        /**
         * <p>The time periods during which the scaling policy can be executed. The time periods must meet the following requirements:</p>
         * <ul>
         * <li>Up to three time periods can be added.</li>
         * <li>Time periods cannot be overlapped.</li>
         * <li>The interval between two consecutive time periods must be greater than or equal to 5 minutes.</li>
         * <li>Each time period must be greater than or equal to 15 minutes.</li>
         * <li>The total length of the time periods that you specify cannot be greater than a day.</li>
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
         * <p>Maximum number of idle sessions. When this value is specified, auto-scaling is triggered only if the session utilization exceeds <code>ScalingUsageThreshold</code> and the current number of idle sessions in the delivery group is less than <code>MaxIdleAppInstanceAmount</code>. Otherwise, it is considered that sufficient idle sessions are available, and no auto-scaling will occur. This parameter allows flexible control over elastic scaling behavior and helps reduce usage costs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxIdleAppInstanceAmount")
        public Integer maxIdleAppInstanceAmount;

        /**
         * <p>The maximum number of resources that can be created for scale-out. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        /**
         * <p>The number of resources that you want to purchase. Valid values: 1 to 100.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required if the resources are subscription resources.</p>
         * </li>
         * <li><p>If the resources are pay-as-you-go resources, this parameter is required only if you set <code>StrategyType</code> to <code>NODE_FIXED</code> or <code>NODE_SCALING_BY_USAGE</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The maximum number of sessions to which a resource can connect at the same time. If a resource connects to a large number of sessions at the same time, the user experience can be compromised. The value range varies based on the resource type. The following items describe the value ranges of different resource types:</p>
         * <ul>
         * <li>appstreaming.general.4c8g: 1 to 2</li>
         * <li>appstreaming.general.8c16g: 1 to 4</li>
         * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
         * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
         * <li>appstreaming.vgpu.14c93g.12g: 1 to 6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

        /**
         * <p>The ID of the resource type that you want to purchase. You can call the <a href="https://help.aliyun.com/document_detail/428502.html">ListNodeInstanceType</a> operation to obtain the ID.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>appstreaming.vgpu.8c16g.4g: WUYING - Graphics_8 vCPUs, 16 GiB Memory, 4 GiB GPU Memory</li>
         * <li>appstreaming.general.8c16g: WUYING - General_8 vCPUs, 16 GiB Memory</li>
         * <li>appstreaming.general.4c8g: WUYING - General_4 vCPUs, 8 GiB Memory</li>
         * <li>appstreaming.vgpu.14c93g.12g: WUYING - Graphics_14 vCPUs, 93 GiB Memory, 12 GiB GPU Memory.</li>
         * <li>appstreaming.vgpu.8c31g.16g: WUYING - Graphics_8 vCPUs, 31 GiB Memory, 16 GiB GPU Memory</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.general.4c8g</p>
         */
        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        /**
         * <p>The schedules of the scaling policy. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
         */
        @NameInMap("RecurrenceSchedules")
        public java.util.List<CreateAppInstanceGroupRequestNodePoolRecurrenceSchedules> recurrenceSchedules;

        /**
         * <p>The maximum retention period of a resource to which no session is connected. If no session is connected to a resource, the resource is automatically scaled in after the specified retention period elapses. Valid values: 5 to 120. Default value: 5. Unit: minutes. If one of the following situations occurs, the resource is not scaled in.</p>
         * <ul>
         * <li>If automatic scale-out is triggered after the resource is scaled in, the scale-in is not executed. This prevents repeated scale-in and scale-out.</li>
         * <li>If automatic scale-out is triggered due to an increase in the number of sessions during the specified period of time, the resource is not scaled in and the countdown restarts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        /**
         * <p>The number of resources that are created each time resources are scaled out. Valid values: 1 to 10. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScalingStep")
        public Integer scalingStep;

        /**
         * <p>The upper limit of session usage. If the session usage exceeds the specified upper limit, auto scaling is automatically triggered. The session usage is calculated by using the following formula: <code>Session usage = Number of current sessions/(Total number of resources × Number of concurrent sessions) × 100%</code>. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>. Valid values: 0 to 100. Default value: 85.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        /**
         * <p>The expiration date of the scaling policy. Format: yyyy-MM-dd. The interval between the expiration date and the effective date must be from 7 days to 1 year. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08</p>
         */
        @NameInMap("StrategyDisableDate")
        public String strategyDisableDate;

        /**
         * <p>The effective date of the scaling policy. Format: yyyy-MM-dd. The date must be the same as or later than the current date. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01</p>
         */
        @NameInMap("StrategyEnableDate")
        public String strategyEnableDate;

        /**
         * <p>The scaling policy of resources.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p><code>NODE_FIXED</code>: fixed number of resources. This value is applicable to pay-as-you-go resources and subscription resources.</p>
         * </li>
         * <li><p><code>NODE_SCALING_BY_USAGE</code>: auto scaling. This value is applicable to pay-as-you-go resources and subscription resources.</p>
         * </li>
         * <li><p><code>NODE_SCALING_BY_SCHEDULE</code>: scheduled scaling. This value is applicable only to pay-as-you-go resources.</p>
         * </li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>NODE_FIXED: fixed number of resources</li>
         * <li>NODE_SCALING_BY_SCHEDULE: scheduled scaling</li>
         * <li>NODE_SCALING_BY_USAGE: auto scaling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NODE_FIXED</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <p>Specifies whether to enable the warmup policy for resources. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
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
         * <p>Specifies whether to enable the debugging mode. If you want to call the <code>GetDebugAppInstance</code> and <code>CreateImageFromAppInstanceGroup</code> operations, you must set this parameter to <code>ON</code>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>OFF</li>
         * <li>ON</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        @NameInMap("DebugMode")
        public String debugMode;

        /**
         * <p>Only one application is allowed to be opened within a single session.</p>
         * <ul>
         * <li>When enabled, launching multiple applications from the delivery group will allocate a separate session for each application, resulting in higher session consumption.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PerSessionPerApp")
        public Boolean perSessionPerApp;

        /**
         * <p>Persistent session scheduling mode.</p>
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
         * <p>Session pre-launch toggle.</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>CONSOLE: console session</li>
         * <li>NORMAL: Remote Desktop Protocol (RDP)-based O\&amp;M session</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        /**
         * <p>The generation mode of the session users. Valid value:</p>
         * <ul>
         * <li>wyid. In this case, you must set sessionPreOpen to false.</li>
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
         * <p>Specifies whether to reset after unbinding from a delivery group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResetAfterUnbind")
        public Boolean resetAfterUnbind;

        /**
         * <p>Specifies whether to skip user permission verification.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false: This is the default value.</li>
         * </ul>
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
         * <p>Remote storage path for user data roaming.</p>
         * <ul>
         * <li>If left empty, the default value is the delivery group ID.</li>
         * <li>For cross-delivery-group (within the same VPC) user data roaming, the same value must be configured for all participating delivery groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ID20250101</p>
         */
        @NameInMap("RemoteStoragePath")
        public String remoteStoragePath;

        /**
         * <p>Remote storage type used for user data roaming.</p>
         * 
         * <strong>example:</strong>
         * <p>NAS</p>
         */
        @NameInMap("RemoteStorageType")
        public String remoteStorageType;

        /**
         * <p>User data roaming toggle.</p>
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
         * <p>The storage types.</p>
         */
        @NameInMap("StorageTypeList")
        public java.util.List<String> storageTypeList;

        /**
         * <p>User data roaming configuration.</p>
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
         * <p>The content of the custom policy. The content must meet the specifications of image versions. To use this parameter, submit a ticket to apply to enable the whitelist feature.</p>
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
         * <p>The account type of the user.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Simple: convenience account</li>
         * </ul>
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
         * <p>Frame rate (FPS).</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("FrameRate")
        public Integer frameRate;

        /**
         * <p>Resolution height, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("SessionResolutionHeight")
        public Integer sessionResolutionHeight;

        /**
         * <p>Resolution width, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("SessionResolutionWidth")
        public Integer sessionResolutionWidth;

        /**
         * <p>Streaming mode. Combined with the Webrtc parameter, it indicates the protocol type.</p>
         * <ul>
         * <li>When Webrtc=true and StreamingMode=video, it indicates a WebRTC stream.</li>
         * <li>When Webrtc=false and StreamingMode=video, it indicates a video stream.</li>
         * <li>When Webrtc=false and StreamingMode=mix, it indicates a mixed stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("StreamingMode")
        public String streamingMode;

        /**
         * <p>Whether to use adaptive resolution.</p>
         * <ul>
         * <li><p>true: The session resolution follows changes in the terminal\&quot;s display area. In this case, SessionResolutionWidth and SessionResolutionHeight represent the maximum values for resolution adjustment.</p>
         * </li>
         * <li><p>false: The session resolution does not follow changes in the terminal\&quot;s display area. In this case, the resolution is fixed to the values of SessionResolutionWidth and SessionResolutionHeight.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TerminalResolutionAdaptive")
        public Boolean terminalResolutionAdaptive;

        /**
         * <p>Whether to enable WebRTC. Combined with the StreamingMode parameter, it indicates the protocol type.</p>
         * <ul>
         * <li>When Webrtc=true and StreamingMode=video, it indicates a WebRTC stream.</li>
         * <li>When Webrtc=false and StreamingMode=video, it indicates a video stream.</li>
         * <li>When Webrtc=false and StreamingMode=mix, it indicates a mixed stream.</li>
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
