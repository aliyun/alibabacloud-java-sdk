// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The billing method.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   PREPAY</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    the subscription billing method</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   POSTPAY</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    the pay-as-you-go billing method</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Specifies whether to activate Tracing Analysis.</p>
     */
    @NameInMap("EnableHardwareAcceleration")
    public Boolean enableHardwareAcceleration;

    /**
     * <p>The tag of the gateway.</p>
     */
    @NameInMap("EnableSls")
    public Boolean enableSls;

    /**
     * <p>The sampling rate of Tracing Analysis. Valid values: [1,100].</p>
     */
    @NameInMap("EnableXtrace")
    public Boolean enableXtrace;

    /**
     * <p>Specifies whether to enable hardware acceleration.</p>
     */
    @NameInMap("EnterpriseSecurityGroup")
    public Boolean enterpriseSecurityGroup;

    /**
     * <p>The ID of the secondary vSwitch.</p>
     */
    @NameInMap("InternetSlbSpec")
    public String internetSlbSpec;

    /**
     * <p>The MSE instance type. Valid values:</p>
     * <br>
     * <p>*   mse_pro: ordinary instance.</p>
     * <p>*   mse_serverless: serverless instance.</p>
     */
    @NameInMap("MserVersion")
    public String mserVersion;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the Network Load Balancer (NLB) instance when the serverless NLB instance is purchased. Valid values:</p>
     * <br>
     * <p>*   pubnet</p>
     * <p>*   privatenet</p>
     * <p>*   privatepubnet</p>
     */
    @NameInMap("NlbNetworkType")
    public String nlbNetworkType;

    /**
     * <p>The specifications of the internal-facing Server Load Balancer (SLB) instance. Valid values:</p>
     * <br>
     * <p>*   slb.s1.small</p>
     * <p>*   slb.s2.small</p>
     * <p>*   slb.s2.medium</p>
     * <p>*   slb.s3.small</p>
     * <p>*   slb.s3.medium</p>
     * <p>*   slb.s3.large</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The number of nodes.</p>
     */
    @NameInMap("Replica")
    public Integer replica;

    /**
     * <p>The extended field.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
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
     * <p>*   MSE_GTW_16_32_200_c(16C32G)</p>
     * <p>*   MSE_GTW_2_4_200_c(2C4G)</p>
     * <p>*   MSE_GTW_4_8_200_c(4C8G)</p>
     * <p>*   MSE_GTW_8_16_200_c(8C16G)</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The tag object.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddGatewayRequestTag> tag;

    /**
     * <p>The ID of the primary vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Specifies whether to use an advanced security group.</p>
     */
    @NameInMap("VSwitchId2")
    public String vSwitchId2;

    /**
     * <p>The ID of the primary vSwitch.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Vpc")
    public String vpc;

    /**
     * <p>Specifies whether to activate Log Service.</p>
     */
    @NameInMap("XtraceRatio")
    public String xtraceRatio;

    /**
     * <p>The details of the zone.</p>
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

    public AddGatewayRequest setInternetSlbSpec(String internetSlbSpec) {
        this.internetSlbSpec = internetSlbSpec;
        return this;
    }
    public String getInternetSlbSpec() {
        return this.internetSlbSpec;
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
         * <p>The value of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the resource group.</p>
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
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
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
