// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeleteTaskTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTaskTemplateResponseBody body;

    public static DeleteTaskTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskTemplateResponse self = new DeleteTaskTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTaskTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTaskTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTaskTemplateResponse setBody(DeleteTaskTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTaskTemplateResponseBody getBody() {
        return this.body;
    }

}
