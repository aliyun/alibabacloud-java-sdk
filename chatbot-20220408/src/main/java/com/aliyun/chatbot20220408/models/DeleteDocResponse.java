// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDocResponseBody body;

    public static DeleteDocResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocResponse self = new DeleteDocResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDocResponse setBody(DeleteDocResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDocResponseBody getBody() {
        return this.body;
    }

}
