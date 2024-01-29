// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateCustomTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomTemplateResponseBody body;

    public static UpdateCustomTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomTemplateResponse self = new UpdateCustomTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomTemplateResponse setBody(UpdateCustomTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomTemplateResponseBody getBody() {
        return this.body;
    }

}
