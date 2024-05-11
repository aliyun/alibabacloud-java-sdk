// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("HttpsPolicy")
    public String httpsPolicy;

    @NameInMap("InstanceCidr")
    public String instanceCidr;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Token")
    public String token;

    @NameInMap("UserVpcId")
    public String userVpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneVSwitchSecurityGroup")
    public java.util.List<CreateInstanceRequestZoneVSwitchSecurityGroup> zoneVSwitchSecurityGroup;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateInstanceRequest setHttpsPolicy(String httpsPolicy) {
        this.httpsPolicy = httpsPolicy;
        return this;
    }
    public String getHttpsPolicy() {
        return this.httpsPolicy;
    }

    public CreateInstanceRequest setInstanceCidr(String instanceCidr) {
        this.instanceCidr = instanceCidr;
        return this;
    }
    public String getInstanceCidr() {
        return this.instanceCidr;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public CreateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateInstanceRequest setTag(java.util.List<CreateInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateInstanceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateInstanceRequest setUserVpcId(String userVpcId) {
        this.userVpcId = userVpcId;
        return this;
    }
    public String getUserVpcId() {
        return this.userVpcId;
    }

    public CreateInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateInstanceRequest setZoneVSwitchSecurityGroup(java.util.List<CreateInstanceRequestZoneVSwitchSecurityGroup> zoneVSwitchSecurityGroup) {
        this.zoneVSwitchSecurityGroup = zoneVSwitchSecurityGroup;
        return this;
    }
    public java.util.List<CreateInstanceRequestZoneVSwitchSecurityGroup> getZoneVSwitchSecurityGroup() {
        return this.zoneVSwitchSecurityGroup;
    }

    public static class CreateInstanceRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTag self = new CreateInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateInstanceRequestZoneVSwitchSecurityGroup extends TeaModel {
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateInstanceRequestZoneVSwitchSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestZoneVSwitchSecurityGroup self = new CreateInstanceRequestZoneVSwitchSecurityGroup();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestZoneVSwitchSecurityGroup setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public CreateInstanceRequestZoneVSwitchSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateInstanceRequestZoneVSwitchSecurityGroup setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateInstanceRequestZoneVSwitchSecurityGroup setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
