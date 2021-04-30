// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetHealthCheckTemplateAttributeRequest extends TeaModel {
    // 健康检查模板Id
    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    public static GetHealthCheckTemplateAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHealthCheckTemplateAttributeRequest self = new GetHealthCheckTemplateAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetHealthCheckTemplateAttributeRequest setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

}
