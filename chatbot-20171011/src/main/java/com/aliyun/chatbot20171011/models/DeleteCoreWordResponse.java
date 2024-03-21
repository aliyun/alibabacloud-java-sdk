// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteCoreWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCoreWordResponseBody body;

    public static DeleteCoreWordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCoreWordResponse self = new DeleteCoreWordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCoreWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCoreWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCoreWordResponse setBody(DeleteCoreWordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCoreWordResponseBody getBody() {
        return this.body;
    }

}
