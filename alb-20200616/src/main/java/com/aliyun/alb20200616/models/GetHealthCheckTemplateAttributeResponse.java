// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetHealthCheckTemplateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHealthCheckTemplateAttributeResponseBody body;

    public static GetHealthCheckTemplateAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHealthCheckTemplateAttributeResponse self = new GetHealthCheckTemplateAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetHealthCheckTemplateAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHealthCheckTemplateAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHealthCheckTemplateAttributeResponse setBody(GetHealthCheckTemplateAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHealthCheckTemplateAttributeResponseBody getBody() {
        return this.body;
    }

}
