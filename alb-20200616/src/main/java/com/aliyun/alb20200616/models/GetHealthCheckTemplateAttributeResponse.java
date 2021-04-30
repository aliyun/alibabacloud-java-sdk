// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetHealthCheckTemplateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetHealthCheckTemplateAttributeResponse setBody(GetHealthCheckTemplateAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHealthCheckTemplateAttributeResponseBody getBody() {
        return this.body;
    }

}
