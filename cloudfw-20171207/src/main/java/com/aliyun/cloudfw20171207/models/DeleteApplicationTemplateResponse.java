// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteApplicationTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationTemplateResponseBody body;

    public static DeleteApplicationTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationTemplateResponse self = new DeleteApplicationTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationTemplateResponse setBody(DeleteApplicationTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationTemplateResponseBody getBody() {
        return this.body;
    }

}
