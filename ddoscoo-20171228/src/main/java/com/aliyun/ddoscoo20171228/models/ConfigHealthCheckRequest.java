// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigHealthCheckRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ForwardProtocol")
    @Validation(required = true)
    public String forwardProtocol;

    @NameInMap("FrontendPort")
    @Validation(required = true)
    public Integer frontendPort;

    @NameInMap("HealthCheck")
    @Validation(required = true)
    public String healthCheck;

    public static ConfigHealthCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigHealthCheckRequest self = new ConfigHealthCheckRequest();
        return TeaModel.build(map, self);
    }

    public ConfigHealthCheckRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigHealthCheckRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public ConfigHealthCheckRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public ConfigHealthCheckRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

}
