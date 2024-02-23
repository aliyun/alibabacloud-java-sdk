// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckTemplateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHealthCheckTemplateAttributeResponseBody body;

    public static UpdateHealthCheckTemplateAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHealthCheckTemplateAttributeResponse self = new UpdateHealthCheckTemplateAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHealthCheckTemplateAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHealthCheckTemplateAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHealthCheckTemplateAttributeResponse setBody(UpdateHealthCheckTemplateAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHealthCheckTemplateAttributeResponseBody getBody() {
        return this.body;
    }

}
