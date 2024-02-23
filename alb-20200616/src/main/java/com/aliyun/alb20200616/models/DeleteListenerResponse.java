// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteListenerResponseBody body;

    public static DeleteListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteListenerResponse self = new DeleteListenerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteListenerResponse setBody(DeleteListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteListenerResponseBody getBody() {
        return this.body;
    }

}
