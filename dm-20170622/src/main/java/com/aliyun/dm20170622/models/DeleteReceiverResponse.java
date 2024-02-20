// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class DeleteReceiverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteReceiverResponseBody body;

    public static DeleteReceiverResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReceiverResponse self = new DeleteReceiverResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReceiverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReceiverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteReceiverResponse setBody(DeleteReceiverResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReceiverResponseBody getBody() {
        return this.body;
    }

}
