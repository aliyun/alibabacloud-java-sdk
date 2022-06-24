// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushTemplateResponseBody body;

    public static PushTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        PushTemplateResponse self = new PushTemplateResponse();
        return TeaModel.build(map, self);
    }

    public PushTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushTemplateResponse setBody(PushTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public PushTemplateResponseBody getBody() {
        return this.body;
    }

}
