// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The billing method. This parameter is specified when you purchase a traditional instance.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The network type of the pay-by-LCU Classic Load Balancer (CLB) to be purchased. Valid values:</p>
     * <ul>
     * <li>pubnet: Internet.</li>
     * <li>privatenet: Internal network.</li>
     * <li>privatepubnet: Internet and internal network.</li>
     * </ul>
     * <blockquote>
     * <p>Traditional instance: When you create a traditional instance, you can purchase only one of the following load balancers: an NLB, a pay-by-LCU CLB, or a pay-by-specification CLB.</p>
     * </blockquote>
     * <blockquote>
     * <p>Serverless instance: When you create a Serverless instance, you can purchase only one of the following load balancers: an NLB or a pay-by-LCU CLB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pubnet</p>
     */
    @NameInMap("ClbNetworkType")
    public String clbNetworkType;

    /**
     * <p>Specifies whether to enable hardware acceleration.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableHardwareAcceleration")
    public Boolean enableHardwareAcceleration;

    /**
     * <p>Specifies whether to enable log delivery to Simple Log Service (SLS).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSls")
    public Boolean enableSls;

    /**
     * <p>Specifies whether to enable Tracing Analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableXtrace")
    public Boolean enableXtrace;

    /**
     * <p>Specifies whether the security group is an advanced security group.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnterpriseSecurityGroup")
    public Boolean enterpriseSecurityGroup;

    /**
     * <p>The specifications of the Internet-facing SLB instance. This parameter is applicable to traditional instances. Valid values:</p>
     * <ul>
     * <li>Basic (slb.s1.small)</li>
     * <li>Standard 1 (slb.s2.small)</li>
     * <li>Standard I (slb.s2.medium)</li>
     * <li>Advanced 1 (slb.s3.small)</li>
     * <li>Advanced I (slb.s3.medium)</li>
     * <li>Ultra-high I (slb.s3.large)</li>
     * </ul>
     * <blockquote>
     * <p>Traditional instance: When you create a traditional instance, you can purchase only one of the following load balancers: an NLB, a pay-by-LCU CLB, or a pay-by-specification CLB.</p>
     * </blockquote>
     * <blockquote>
     * <p>Serverless instance: When you create a Serverless instance, you can purchase only one of the following load balancers: an NLB or a pay-by-LCU CLB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>slb.s2.small</p>
     */
    @NameInMap("InternetSlbSpec")
    @Deprecated
    public String internetSlbSpec;

    /**
     * <p>The gateway ingress type. This parameter is applicable to the Professional Edition of a standard instance. Valid values:</p>
     * <ul>
     * <li>pubnet: Internet.</li>
     * <li>privatenet: Internal network.</li>
     * <li>privatepubnet: Internet and internal network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pubnet</p>
     */
    @NameInMap("ManagedEntryNetworkType")
    public String managedEntryNetworkType;

    /**
     * <p>The gateway product type. Valid values:</p>
     * <ul>
     * <li>mse_premium: Professional Edition of a standard instance.</li>
     * <li>mse_pro: Standard Edition of a standard instance.</li>
     * <li>mse_serverless: Serverless.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mse_pro</p>
     */
    @NameInMap("MserVersion")
    public String mserVersion;

    /**
     * <p>The name of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ceshi</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the Network Load Balancer (NLB) to be purchased. Valid values:</p>
     * <ul>
     * <li>pubnet: Internet.</li>
     * <li>privatenet: Internal network.</li>
     * <li>privatepubnet: Internet and internal network.</li>
     * </ul>
     * <blockquote>
     * <p>Traditional instance: When you create a traditional instance, you can purchase only one of the following load balancers: an NLB, a pay-by-LCU Classic Load Balancer (CLB), or a pay-by-specification CLB.</p>
     * </blockquote>
     * <blockquote>
     * <p>Serverless instance: When you create a Serverless instance, you can purchase only one of the following load balancers: an NLB or a pay-by-LCU CLB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pubnet</p>
     */
    @NameInMap("NlbNetworkType")
    public String nlbNetworkType;

    /**
     * <p>The region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The number of nodes. This parameter is specified when you purchase a traditional instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Replica")
    public Integer replica;

    /**
     * <p>The extended fields.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm34x43l*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The specifications of the internal-facing Server Load Balancer (SLB) instance. This parameter is applicable to traditional instances. Valid values:</p>
     * <ul>
     * <li>Basic (slb.s1.small)</li>
     * <li>Standard 1 (slb.s2.small)</li>
     * <li>Standard I (slb.s2.medium)</li>
     * <li>Advanced 1 (slb.s3.small)</li>
     * <li>Advanced I (slb.s3.medium)</li>
     * <li>Ultra-high I (slb.s3.large)</li>
     * </ul>
     * <blockquote>
     * <p>Traditional instance: When you create a traditional instance, you can purchase only one of the following load balancers: an NLB, a pay-by-LCU CLB, or a pay-by-specification CLB.</p>
     * </blockquote>
     * <blockquote>
     * <p>Serverless instance: When you create a Serverless instance, you can purchase only one of the following load balancers: an NLB or a pay-by-LCU CLB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>slb.s2.small</p>
     */
    @NameInMap("SlbSpec")
    @Deprecated
    public String slbSpec;

    /**
     * <p>The node specifications. This parameter is specified when you purchase a traditional instance. Valid values:</p>
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
     * <p>The tags of the gateway.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddGatewayRequestTag> tag;

    /**
     * <p>The ID of the primary vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1q8th57frl5khj2li43</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the secondary vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-wz9bu6o5vsvitt5mrxo6s</p>
     */
    @NameInMap("VSwitchId2")
    public String vSwitchId2;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15mncnrtm83uauxd1xb</p>
     */
    @NameInMap("Vpc")
    public String vpc;

    /**
     * <p>The sampling rate for Tracing Analysis. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("XtraceRatio")
    public String xtraceRatio;

    /**
     * <p>The zone information.</p>
     */
    @NameInMap("ZoneInfo")
    public java.util.List<AddGatewayRequestZoneInfo> zoneInfo;

    public static AddGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayRequest self = new AddGatewayRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public AddGatewayRequest setClbNetworkType(String clbNetworkType) {
        this.clbNetworkType = clbNetworkType;
        return this;
    }
    public String getClbNetworkType() {
        return this.clbNetworkType;
    }

    public AddGatewayRequest setEnableHardwareAcceleration(Boolean enableHardwareAcceleration) {
        this.enableHardwareAcceleration = enableHardwareAcceleration;
        return this;
    }
    public Boolean getEnableHardwareAcceleration() {
        return this.enableHardwareAcceleration;
    }

    public AddGatewayRequest setEnableSls(Boolean enableSls) {
        this.enableSls = enableSls;
        return this;
    }
    public Boolean getEnableSls() {
        return this.enableSls;
    }

    public AddGatewayRequest setEnableXtrace(Boolean enableXtrace) {
        this.enableXtrace = enableXtrace;
        return this;
    }
    public Boolean getEnableXtrace() {
        return this.enableXtrace;
    }

    public AddGatewayRequest setEnterpriseSecurityGroup(Boolean enterpriseSecurityGroup) {
        this.enterpriseSecurityGroup = enterpriseSecurityGroup;
        return this;
    }
    public Boolean getEnterpriseSecurityGroup() {
        return this.enterpriseSecurityGroup;
    }

    @Deprecated
    public AddGatewayRequest setInternetSlbSpec(String internetSlbSpec) {
        this.internetSlbSpec = internetSlbSpec;
        return this;
    }
    public String getInternetSlbSpec() {
        return this.internetSlbSpec;
    }

    public AddGatewayRequest setManagedEntryNetworkType(String managedEntryNetworkType) {
        this.managedEntryNetworkType = managedEntryNetworkType;
        return this;
    }
    public String getManagedEntryNetworkType() {
        return this.managedEntryNetworkType;
    }

    public AddGatewayRequest setMserVersion(String mserVersion) {
        this.mserVersion = mserVersion;
        return this;
    }
    public String getMserVersion() {
        return this.mserVersion;
    }

    public AddGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayRequest setNlbNetworkType(String nlbNetworkType) {
        this.nlbNetworkType = nlbNetworkType;
        return this;
    }
    public String getNlbNetworkType() {
        return this.nlbNetworkType;
    }

    public AddGatewayRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddGatewayRequest setReplica(Integer replica) {
        this.replica = replica;
        return this;
    }
    public Integer getReplica() {
        return this.replica;
    }

    public AddGatewayRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public AddGatewayRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    @Deprecated
    public AddGatewayRequest setSlbSpec(String slbSpec) {
        this.slbSpec = slbSpec;
        return this;
    }
    public String getSlbSpec() {
        return this.slbSpec;
    }

    public AddGatewayRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public AddGatewayRequest setTag(java.util.List<AddGatewayRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddGatewayRequestTag> getTag() {
        return this.tag;
    }

    public AddGatewayRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public AddGatewayRequest setVSwitchId2(String vSwitchId2) {
        this.vSwitchId2 = vSwitchId2;
        return this;
    }
    public String getVSwitchId2() {
        return this.vSwitchId2;
    }

    public AddGatewayRequest setVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }
    public String getVpc() {
        return this.vpc;
    }

    public AddGatewayRequest setXtraceRatio(String xtraceRatio) {
        this.xtraceRatio = xtraceRatio;
        return this;
    }
    public String getXtraceRatio() {
        return this.xtraceRatio;
    }

    public AddGatewayRequest setZoneInfo(java.util.List<AddGatewayRequestZoneInfo> zoneInfo) {
        this.zoneInfo = zoneInfo;
        return this;
    }
    public java.util.List<AddGatewayRequestZoneInfo> getZoneInfo() {
        return this.zoneInfo;
    }

    public static class AddGatewayRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddGatewayRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRequestTag self = new AddGatewayRequestTag();
            return TeaModel.build(map, self);
        }

        public AddGatewayRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddGatewayRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AddGatewayRequestZoneInfo extends TeaModel {
        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp*****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static AddGatewayRequestZoneInfo build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRequestZoneInfo self = new AddGatewayRequestZoneInfo();
            return TeaModel.build(map, self);
        }

        public AddGatewayRequestZoneInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public AddGatewayRequestZoneInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
