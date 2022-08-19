// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ApplyHealthCheckTemplateToServerGroupRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    @NameInMap("ServerGroupId")
    public String serverGroupId;

    public static ApplyHealthCheckTemplateToServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyHealthCheckTemplateToServerGroupRequest self = new ApplyHealthCheckTemplateToServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public ApplyHealthCheckTemplateToServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApplyHealthCheckTemplateToServerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ApplyHealthCheckTemplateToServerGroupRequest setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    public ApplyHealthCheckTemplateToServerGroupRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

}
