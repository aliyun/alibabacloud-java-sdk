// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyNetworkRuleAttributeRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("ForwardProtocol")
    public String forwardProtocol;

    @NameInMap("FrontendPort")
    public Integer frontendPort;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyNetworkRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkRuleAttributeRequest self = new ModifyNetworkRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkRuleAttributeRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyNetworkRuleAttributeRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public ModifyNetworkRuleAttributeRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public ModifyNetworkRuleAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
