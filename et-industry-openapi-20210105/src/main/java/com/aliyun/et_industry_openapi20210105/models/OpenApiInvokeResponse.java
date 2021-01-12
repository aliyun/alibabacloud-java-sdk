// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20210105.models;

import com.aliyun.tea.*;

public class OpenApiInvokeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenApiInvokeResponseBody body;

    public static OpenApiInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiInvokeResponse self = new OpenApiInvokeResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiInvokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiInvokeResponse setBody(OpenApiInvokeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiInvokeResponseBody getBody() {
        return this.body;
    }

}
