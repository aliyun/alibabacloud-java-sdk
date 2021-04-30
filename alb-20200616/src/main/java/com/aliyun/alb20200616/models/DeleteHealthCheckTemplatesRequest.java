// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteHealthCheckTemplatesRequest extends TeaModel {
    // 健康检查模板Id列表
    @NameInMap("HealthCheckTemplateIds")
    public java.util.List<String> healthCheckTemplateIds;

    // 幂等token
    @NameInMap("ClientToken")
    public String clientToken;

    // dryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static DeleteHealthCheckTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHealthCheckTemplatesRequest self = new DeleteHealthCheckTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHealthCheckTemplatesRequest setHealthCheckTemplateIds(java.util.List<String> healthCheckTemplateIds) {
        this.healthCheckTemplateIds = healthCheckTemplateIds;
        return this;
    }
    public java.util.List<String> getHealthCheckTemplateIds() {
        return this.healthCheckTemplateIds;
    }

    public DeleteHealthCheckTemplatesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteHealthCheckTemplatesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
