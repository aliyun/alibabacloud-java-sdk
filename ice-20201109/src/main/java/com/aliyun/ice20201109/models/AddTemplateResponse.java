// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTemplateResponseBody body;

    public static AddTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTemplateResponse self = new AddTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTemplateResponse setBody(AddTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTemplateResponseBody getBody() {
        return this.body;
    }

}
