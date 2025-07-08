// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteMessageCallbackNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMessageCallbackNewResponseBody body;

    public static DeleteMessageCallbackNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageCallbackNewResponse self = new DeleteMessageCallbackNewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMessageCallbackNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMessageCallbackNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMessageCallbackNewResponse setBody(DeleteMessageCallbackNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMessageCallbackNewResponseBody getBody() {
        return this.body;
    }

}
