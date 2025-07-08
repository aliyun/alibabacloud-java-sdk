// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteMessageQueueNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMessageQueueNewResponseBody body;

    public static DeleteMessageQueueNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageQueueNewResponse self = new DeleteMessageQueueNewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMessageQueueNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMessageQueueNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMessageQueueNewResponse setBody(DeleteMessageQueueNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMessageQueueNewResponseBody getBody() {
        return this.body;
    }

}
