// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteWebFilterTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWebFilterTemplateResponseBody body;

    public static DeleteWebFilterTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebFilterTemplateResponse self = new DeleteWebFilterTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebFilterTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebFilterTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebFilterTemplateResponse setBody(DeleteWebFilterTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebFilterTemplateResponseBody getBody() {
        return this.body;
    }

}
