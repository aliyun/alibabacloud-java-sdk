// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class RunInstancesRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("EipBandwidth")
    public Integer eipBandwidth;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Period")
    public Long period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // 标签列表，最多包含20个子项
    @NameInMap("Tag")
    public java.util.List<RunInstancesRequestTag> tag;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static RunInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesRequest self = new RunInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RunInstancesRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public RunInstancesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RunInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RunInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public RunInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunInstancesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunInstancesRequest setEipBandwidth(Integer eipBandwidth) {
        this.eipBandwidth = eipBandwidth;
        return this;
    }
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    public RunInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RunInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public RunInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RunInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public RunInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RunInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RunInstancesRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public RunInstancesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RunInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunInstancesRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public RunInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RunInstancesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RunInstancesRequest setTag(java.util.List<RunInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RunInstancesRequestTag> getTag() {
        return this.tag;
    }

    public RunInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class RunInstancesRequestTag extends TeaModel {
        // 标签键
        @NameInMap("Key")
        public String key;

        // 标签值
        @NameInMap("Value")
        public String value;

        public static RunInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestTag self = new RunInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
