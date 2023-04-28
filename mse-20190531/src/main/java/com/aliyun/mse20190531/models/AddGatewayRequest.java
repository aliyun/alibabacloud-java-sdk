// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("EnableHardwareAcceleration")
    public Boolean enableHardwareAcceleration;

    @NameInMap("EnableSls")
    public Boolean enableSls;

    @NameInMap("EnableXtrace")
    public Boolean enableXtrace;

    @NameInMap("EnterpriseSecurityGroup")
    public Boolean enterpriseSecurityGroup;

    @NameInMap("InternetSlbSpec")
    public String internetSlbSpec;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>system error</p>
     */
    @NameInMap("Replica")
    public Integer replica;

    /**
     * <p>扩展字段。</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("SlbSpec")
    public String slbSpec;

    /**
     * <p>systemError</p>
     */
    @NameInMap("Spec")
    public String spec;

    @NameInMap("Tag")
    public java.util.List<AddGatewayRequestTag> tag;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VSwitchId2")
    public String vSwitchId2;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("Vpc")
    public String vpc;

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

    public static class AddGatewayRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
