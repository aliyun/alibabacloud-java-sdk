// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckConfigRequest extends TeaModel {
    @NameInMap("ForwardProtocol")
    public String forwardProtocol;

    @NameInMap("FrontendPort")
    public Integer frontendPort;

    @NameInMap("HealthCheck")
    public String healthCheck;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyHealthCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckConfigRequest self = new ModifyHealthCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckConfigRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public ModifyHealthCheckConfigRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public ModifyHealthCheckConfigRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public ModifyHealthCheckConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
