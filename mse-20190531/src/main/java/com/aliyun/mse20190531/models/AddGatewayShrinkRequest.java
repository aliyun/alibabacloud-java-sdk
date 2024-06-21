// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The billing method.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>PREPAY</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>the subscription billing method</p>
     * <!-- -->
     * </li>
     * <li><p>POSTPAY</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>the pay-as-you-go billing method</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClbNetworkType")
    public String clbNetworkType;

    /**
     * <p>Specifies whether to activate Tracing Analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableHardwareAcceleration")
    public Boolean enableHardwareAcceleration;

    /**
     * <p>The tag of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSls")
    public Boolean enableSls;

    /**
     * <p>The sampling rate of Tracing Analysis. Valid values: [1,100].</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableXtrace")
    public Boolean enableXtrace;

    /**
     * <p>Specifies whether to enable hardware acceleration.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnterpriseSecurityGroup")
    public Boolean enterpriseSecurityGroup;

    /**
     * <p>The ID of the secondary vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s2.small</p>
     */
    @NameInMap("InternetSlbSpec")
    public String internetSlbSpec;

    /**
     * <p>The MSE instance type. Valid values:</p>
     * <ul>
     * <li>mse_pro: ordinary instance.</li>
     * <li>mse_serverless: serverless instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mse_pro</p>
     */
    @NameInMap("MserVersion")
    public String mserVersion;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ceshi</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the Network Load Balancer (NLB) instance when the serverless NLB instance is purchased. Valid values:</p>
     * <ul>
     * <li>pubnet</li>
     * <li>privatenet</li>
     * <li>privatepubnet</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pubnet</p>
     */
    @NameInMap("NlbNetworkType")
    public String nlbNetworkType;

    /**
     * <p>The specifications of the internal-facing Server Load Balancer (SLB) instance. Valid values:</p>
     * <ul>
     * <li>slb.s1.small</li>
     * <li>slb.s2.small</li>
     * <li>slb.s2.medium</li>
     * <li>slb.s3.small</li>
     * <li>slb.s3.medium</li>
     * <li>slb.s3.large</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Replica")
    public Integer replica;

    /**
     * <p>The extended field.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm34x43l*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The specifications of the internal-facing Server Load Balancer (SLB) instance. Valid values:</p>
     * <ul>
     * <li>slb.s1.small</li>
     * <li>slb.s2.small</li>
     * <li>slb.s2.medium</li>
     * <li>slb.s3.small</li>
     * <li>slb.s3.medium</li>
     * <li>slb.s3.large</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>slb.s2.small</p>
     */
    @NameInMap("SlbSpec")
    public String slbSpec;

    /**
     * <p>The node specifications. Valid values:</p>
     * <ul>
     * <li>MSE_GTW_16_32_200_c(16C32G)</li>
     * <li>MSE_GTW_2_4_200_c(2C4G)</li>
     * <li>MSE_GTW_4_8_200_c(4C8G)</li>
     * <li>MSE_GTW_8_16_200_c(8C16G)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MSE_GTW_2_4_200_c</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The tag object.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddGatewayShrinkRequestTag> tag;

    /**
     * <p>The ID of the primary vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1q8th57frl5khj2li43</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Specifies whether to use an advanced security group.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-wz9bu6o5vsvitt5mrxo6s</p>
     */
    @NameInMap("VSwitchId2")
    public String vSwitchId2;

    /**
     * <p>The ID of the primary vSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15mncnrtm83uauxd1xb</p>
     */
    @NameInMap("Vpc")
    public String vpc;

    /**
     * <p>Specifies whether to activate Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("XtraceRatio")
    public String xtraceRatio;

    /**
     * <p>The details of the zone.</p>
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

    public AddGatewayShrinkRequest setClbNetworkType(String clbNetworkType) {
        this.clbNetworkType = clbNetworkType;
        return this;
    }
    public String getClbNetworkType() {
        return this.clbNetworkType;
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

    public AddGatewayShrinkRequest setMserVersion(String mserVersion) {
        this.mserVersion = mserVersion;
        return this;
    }
    public String getMserVersion() {
        return this.mserVersion;
    }

    public AddGatewayShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayShrinkRequest setNlbNetworkType(String nlbNetworkType) {
        this.nlbNetworkType = nlbNetworkType;
        return this;
    }
    public String getNlbNetworkType() {
        return this.nlbNetworkType;
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
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
