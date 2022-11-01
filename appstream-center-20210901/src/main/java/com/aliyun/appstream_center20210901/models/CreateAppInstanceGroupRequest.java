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

    @NameInMap("NodePool")
    public CreateAppInstanceGroupRequestNodePool nodePool;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

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

    public CreateAppInstanceGroupRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
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

    public static class CreateAppInstanceGroupRequestNodePool extends TeaModel {
        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        @NameInMap("ScalingStep")
        public Integer scalingStep;

        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        @NameInMap("StrategyType")
        public String strategyType;

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

        public CreateAppInstanceGroupRequestNodePool setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
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
