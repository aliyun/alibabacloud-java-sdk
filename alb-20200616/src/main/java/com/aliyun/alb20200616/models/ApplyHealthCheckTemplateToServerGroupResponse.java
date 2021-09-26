// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ApplyHealthCheckTemplateToServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyHealthCheckTemplateToServerGroupResponseBody body;

    public static ApplyHealthCheckTemplateToServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyHealthCheckTemplateToServerGroupResponse self = new ApplyHealthCheckTemplateToServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public ApplyHealthCheckTemplateToServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyHealthCheckTemplateToServerGroupResponse setBody(ApplyHealthCheckTemplateToServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyHealthCheckTemplateToServerGroupResponseBody getBody() {
        return this.body;
    }

}
