// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>付费类型。</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Specifies whether to enable hardware acceleration.</p>
     */
    @NameInMap("EnableHardwareAcceleration")
    public Boolean enableHardwareAcceleration;

    /**
     * <p>Specifies whether to activate Log Service.</p>
     */
    @NameInMap("EnableSls")
    public Boolean enableSls;

    /**
     * <p>Specifies whether to activate Tracing Analysis.</p>
     */
    @NameInMap("EnableXtrace")
    public Boolean enableXtrace;

    /**
     * <p>Specifies whether to use an advanced security group.</p>
     */
    @NameInMap("EnterpriseSecurityGroup")
    public Boolean enterpriseSecurityGroup;

    /**
     * <p>The specifications of the Internet-facing SLB instance. Valid values:</p>
     * <br>
     * <p>*   slb.s1.small</p>
     * <p>*   slb.s2.small</p>
     * <p>*   slb.s2.medium</p>
     * <p>*   slb.s3.small</p>
     * <p>*   slb.s3.medium</p>
     * <p>*   slb.s3.large</p>
     */
    @NameInMap("InternetSlbSpec")
    public String internetSlbSpec;

    /**
     * <p>The name of the gateway.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The number of nodes.</p>
     */
    @NameInMap("Replica")
    public Integer replica;

    /**
     * <p>扩展字段。</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The specifications of the internal-facing Server Load Balancer (SLB) instance. Valid values:</p>
     * <br>
     * <p>*   slb.s1.small</p>
     * <p>*   slb.s2.small</p>
     * <p>*   slb.s2.medium</p>
     * <p>*   slb.s3.small</p>
     * <p>*   slb.s3.medium</p>
     * <p>*   slb.s3.large</p>
     */
    @NameInMap("SlbSpec")
    public String slbSpec;

    /**
     * <p>The node specifications. Valid values:</p>
     * <br>
     * <p>*   MSE_GTW\_16\_32\_200\_c(16C32G)</p>
     * <p>*   MSE_GTW\_2\_4\_200\_c(2C4G)</p>
     * <p>*   MSE_GTW\_4\_8\_200\_c(4C8G)</p>
     * <p>*   MSE_GTW\_8\_16\_200\_c(8C16G)</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The tag of the gateway.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddGatewayShrinkRequestTag> tag;

    /**
     * <p>The ID of the primary vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the secondary vSwitch.</p>
     */
    @NameInMap("VSwitchId2")
    public String vSwitchId2;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     */
    @NameInMap("Vpc")
    public String vpc;

    /**
     * <p>The sampling rate of Tracing Analysis. Valid values: \[1,100].</p>
     */
    @NameInMap("XtraceRatio")
    public String xtraceRatio;

    /**
     * <p>可用区信息。</p>
     */
    @NameInMap("ZoneInfo")
    public String zoneInfoShrink;

    public static AddGatewayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayShrinkRequest self = new AddGatewayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public AddGatewayShrinkRequest setEnableHardwareAcceleration(Boolean enableHardwareAcceleration) {
        this.enableHardwareAcceleration = enableHardwareAcceleration;
        return this;
    }
    public Boolean getEnableHardwareAcceleration() {
        return this.enableHardwareAcceleration;
    }

    public AddGatewayShrinkRequest setEnableSls(Boolean enableSls) {
        this.enableSls = enableSls;
        return this;
    }
    public Boolean getEnableSls() {
        return this.enableSls;
    }

    public AddGatewayShrinkRequest setEnableXtrace(Boolean enableXtrace) {
        this.enableXtrace = enableXtrace;
        return this;
    }
    public Boolean getEnableXtrace() {
        return this.enableXtrace;
    }

    public AddGatewayShrinkRequest setEnterpriseSecurityGroup(Boolean enterpriseSecurityGroup) {
        this.enterpriseSecurityGroup = enterpriseSecurityGroup;
        return this;
    }
    public Boolean getEnterpriseSecurityGroup() {
        return this.enterpriseSecurityGroup;
    }

    public AddGatewayShrinkRequest setInternetSlbSpec(String internetSlbSpec) {
        this.internetSlbSpec = internetSlbSpec;
        return this;
    }
    public String getInternetSlbSpec() {
        return this.internetSlbSpec;
    }

    public AddGatewayShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddGatewayShrinkRequest setReplica(Integer replica) {
        this.replica = replica;
        return this;
    }
    public Integer getReplica() {
        return this.replica;
    }

    public AddGatewayShrinkRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public AddGatewayShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddGatewayShrinkRequest setSlbSpec(String slbSpec) {
        this.slbSpec = slbSpec;
        return this;
    }
    public String getSlbSpec() {
        return this.slbSpec;
    }

    public AddGatewayShrinkRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public AddGatewayShrinkRequest setTag(java.util.List<AddGatewayShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddGatewayShrinkRequestTag> getTag() {
        return this.tag;
    }

    public AddGatewayShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public AddGatewayShrinkRequest setVSwitchId2(String vSwitchId2) {
        this.vSwitchId2 = vSwitchId2;
        return this;
    }
    public String getVSwitchId2() {
        return this.vSwitchId2;
    }

    public AddGatewayShrinkRequest setVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }
    public String getVpc() {
        return this.vpc;
    }

    public AddGatewayShrinkRequest setXtraceRatio(String xtraceRatio) {
        this.xtraceRatio = xtraceRatio;
        return this;
    }
    public String getXtraceRatio() {
        return this.xtraceRatio;
    }

    public AddGatewayShrinkRequest setZoneInfoShrink(String zoneInfoShrink) {
        this.zoneInfoShrink = zoneInfoShrink;
        return this;
    }
    public String getZoneInfoShrink() {
        return this.zoneInfoShrink;
    }

    public static class AddGatewayShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddGatewayShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayShrinkRequestTag self = new AddGatewayShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public AddGatewayShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddGatewayShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
