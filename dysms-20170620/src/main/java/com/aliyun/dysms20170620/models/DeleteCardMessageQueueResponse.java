// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteCardMessageQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCardMessageQueueResponseBody body;

    public static DeleteCardMessageQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCardMessageQueueResponse self = new DeleteCardMessageQueueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCardMessageQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCardMessageQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCardMessageQueueResponse setBody(DeleteCardMessageQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCardMessageQueueResponseBody getBody() {
        return this.body;
    }

}
