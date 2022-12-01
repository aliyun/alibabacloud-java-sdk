// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CreateMyBaseShrinkRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DedicatedHostGroupDescription")
    public String dedicatedHostGroupDescription;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("ECSClassList")
    public String ECSClassListShrink;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OsPassword")
    public String osPassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PasswordInherit")
    public String passwordInherit;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Period")
    public String period;

    @NameInMap("PeriodType")
    public String periodType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateMyBaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMyBaseShrinkRequest self = new CreateMyBaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMyBaseShrinkRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateMyBaseShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateMyBaseShrinkRequest setDedicatedHostGroupDescription(String dedicatedHostGroupDescription) {
        this.dedicatedHostGroupDescription = dedicatedHostGroupDescription;
        return this;
    }
    public String getDedicatedHostGroupDescription() {
        return this.dedicatedHostGroupDescription;
    }

    public CreateMyBaseShrinkRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CreateMyBaseShrinkRequest setECSClassListShrink(String ECSClassListShrink) {
        this.ECSClassListShrink = ECSClassListShrink;
        return this;
    }
    public String getECSClassListShrink() {
        return this.ECSClassListShrink;
    }

    public CreateMyBaseShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateMyBaseShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateMyBaseShrinkRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateMyBaseShrinkRequest setOsPassword(String osPassword) {
        this.osPassword = osPassword;
        return this;
    }
    public String getOsPassword() {
        return this.osPassword;
    }

    public CreateMyBaseShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMyBaseShrinkRequest setPasswordInherit(String passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public String getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateMyBaseShrinkRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateMyBaseShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateMyBaseShrinkRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public CreateMyBaseShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMyBaseShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMyBaseShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateMyBaseShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateMyBaseShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateMyBaseShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateMyBaseShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
