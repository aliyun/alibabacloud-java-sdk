// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteLgfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLgfResponseBody body;

    public static DeleteLgfResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLgfResponse self = new DeleteLgfResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLgfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLgfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLgfResponse setBody(DeleteLgfResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLgfResponseBody getBody() {
        return this.body;
    }

}
