// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ApplyHealthCheckTemplateToServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ApplyHealthCheckTemplateToServerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyHealthCheckTemplateToServerGroupResponse setBody(ApplyHealthCheckTemplateToServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyHealthCheckTemplateToServerGroupResponseBody getBody() {
        return this.body;
    }

}
