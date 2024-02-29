// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteMessageTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMessageTemplateResponseBody body;

    public static DeleteMessageTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageTemplateResponse self = new DeleteMessageTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMessageTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMessageTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMessageTemplateResponse setBody(DeleteMessageTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMessageTemplateResponseBody getBody() {
        return this.body;
    }

}
