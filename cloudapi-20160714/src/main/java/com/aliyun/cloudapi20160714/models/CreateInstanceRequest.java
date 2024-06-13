// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Whether to automatically pay when renewing. Value:</p>
     * <br>
     * <p>- True: Automatic payment. Please ensure that your account has sufficient balance.</p>
     * <p>- False: Console manual payment. The specific operation is to log in to the console, select Expenses in the upper right corner, enter the Expense Center, and find the target order in Order Management to make payment.</p>
     * <br>
     * <p>Default value: False.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The billing method of the instance. Valid values: PostPaid (pay-as-you-go) and PrePaid (subscription).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The subscription duration of the instance.</p>
     * <br>
     * <p>*   Valid values if PricingCycle is set to **Month**: **1** to **9**</p>
     * <p>*   Valid values if PricingCycle is set to **Year**: **1** to **3**</p>
     * <br>
     * <p>>  This parameter is available and required only if the ChargeType parameter is set to **PrePaid**.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The HTTPS policy.</p>
     */
    @NameInMap("HttpsPolicy")
    public String httpsPolicy;

    /**
     * <p>The CIDR block of the VPC integration instance.</p>
     * <br>
     * <p>*   192.168.0.0/16</p>
     * <p>*   172.16.0.0/12</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**Warning** The VPC integration instance is connected to the specified CIDR block. Plan your CIDR block carefully to prevent overlaps with the private IP addresses of cloud services.</p>
     * <br>
     * <p>>  This parameter is in invitational preview and not available for public use.</p>
     */
    @NameInMap("InstanceCidr")
    public String instanceCidr;

    /**
     * <p>Instance Name</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Instance specifications</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The type of the dedicated instance. Valid values:</p>
     * <br>
     * <p>*   vpc_connect: a VPC integration instance</p>
     * <p>*   normal: a conventional dedicated instance</p>
     * <br>
     * <p>>  This parameter is in invitational preview and not available for public use.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The unit of the subscription duration of the subscription instance. Valid values:</p>
     * <br>
     * <p>*   **year**</p>
     * <p>*   **month**</p>
     * <br>
     * <p>>  This parameter is available and required only if the ChargeType parameter is set to PrePaid.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The tags that you want to add to the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    /**
     * <p>Passwords are used to prevent duplicate requests from being submitted, please do not reuse them.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the user\\"s VPC to be connected by the VPC integration instance.</p>
     * <br>
     * <p>>  This parameter is in invitational preview and not available for public use.</p>
     */
    @NameInMap("UserVpcId")
    public String userVpcId;

    /**
     * <p>The zone in which you want to create the instance. This parameter is required for a conventional dedicated instance and optional for a virtual private cloud (VPC) integration instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The network information when the instance is a VPC integration instance, such as the zone, vSwitch, and security group.</p>
     * <br>
     * <p>>  This parameter is in invitational preview and not available for public use.</p>
     */
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>The IPv4 CIDR block for the vSwitch.</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The ID of the security group. Services in the same security group can access each other.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         */
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
