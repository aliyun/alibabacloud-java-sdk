// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ApplyHealthCheckTemplateToServerGroupRequest extends TeaModel {
    // 健康检查模板Id
    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    // 服务器组Id
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    // 幂等Token
    @NameInMap("ClientToken")
    public String clientToken;

    // dryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static ApplyHealthCheckTemplateToServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyHealthCheckTemplateToServerGroupRequest self = new ApplyHealthCheckTemplateToServerGroupRequest();
        return TeaModel.build(map, self);
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

}
