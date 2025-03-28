// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class AicsOpenApiInvokeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AicsOpenApiInvokeResponseBody body;

    public static AicsOpenApiInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        AicsOpenApiInvokeResponse self = new AicsOpenApiInvokeResponse();
        return TeaModel.build(map, self);
    }

    public AicsOpenApiInvokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AicsOpenApiInvokeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AicsOpenApiInvokeResponse setBody(AicsOpenApiInvokeResponseBody body) {
        this.body = body;
        return this;
    }
    public AicsOpenApiInvokeResponseBody getBody() {
        return this.body;
    }

}
