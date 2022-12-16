// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // Specifies whether to enable hardware acceleration.
    @NameInMap("EnableHardwareAcceleration")
    public Boolean enableHardwareAcceleration;

    // Specifies whether to enable Log Service.
    @NameInMap("EnableSls")
    public Boolean enableSls;

    // Specifies whether to enable Tracing Analysis.
    @NameInMap("EnableXtrace")
    public Boolean enableXtrace;

    // Specifies whether to use an advanced security group.
    @NameInMap("EnterpriseSecurityGroup")
    public Boolean enterpriseSecurityGroup;

    // The specifications of the Internet-facing SLB instance.
    // 
    // *   slb.s1.small
    // *   slb.s2.small
    // *   slb.s2.medium
    // *   slb.s3.small
    // *   slb.s3.medium
    // *   slb.s3.large
    @NameInMap("InternetSlbSpec")
    public String internetSlbSpec;

    // The name of the gateway.
    @NameInMap("Name")
    public String name;

    // The ID of the region.
    @NameInMap("Region")
    public String region;

    // The number of nodes.
    @NameInMap("Replica")
    public Integer replica;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The specifications of the internal-facing Server Load Balancer (SLB) instance.
    // 
    // *   slb.s1.small
    // *   slb.s2.small
    // *   slb.s2.medium
    // *   slb.s3.small
    // *   slb.s3.medium
    // *   slb.s3.large
    @NameInMap("SlbSpec")
    public String slbSpec;

    // The node specifications.
    // 
    // *   MSE_GTW\_16\_32\_200\_c(16C32G)
    // *   MSE_GTW\_2\_4\_200\_c(2C4G)
    // *   MSE_GTW\_4\_8\_200\_c(4C8G)
    // *   MSE_GTW\_8\_16\_200\_c(8C16G)
    @NameInMap("Spec")
    public String spec;

    // The tag of the gateway.
    @NameInMap("Tag")
    public java.util.List<AddGatewayRequestTag> tag;

    // The ID of the primary vSwitch.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The ID of the secondary vSwitch.
    @NameInMap("VSwitchId2")
    public String vSwitchId2;

    // The ID of the virtual private cloud (VPC).
    @NameInMap("Vpc")
    public String vpc;

    // The sample rate of Tracing Analysis. Valid values: \[1,100].
    @NameInMap("XtraceRatio")
    public String xtraceRatio;

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

    public AddGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public static class AddGatewayRequestTag extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
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

}
