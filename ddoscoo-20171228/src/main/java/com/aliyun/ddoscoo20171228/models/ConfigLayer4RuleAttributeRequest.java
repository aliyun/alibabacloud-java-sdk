// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleAttributeRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("ForwardProtocol")
    public String forwardProtocol;

    @NameInMap("FrontendPort")
    public Integer frontendPort;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ConfigLayer4RuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleAttributeRequest self = new ConfigLayer4RuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleAttributeRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ConfigLayer4RuleAttributeRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public ConfigLayer4RuleAttributeRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public ConfigLayer4RuleAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
