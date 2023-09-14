// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateHealthCheckTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the health check template.</p>
     */
    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHealthCheckTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHealthCheckTemplateResponseBody self = new CreateHealthCheckTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHealthCheckTemplateResponseBody setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    public CreateHealthCheckTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
