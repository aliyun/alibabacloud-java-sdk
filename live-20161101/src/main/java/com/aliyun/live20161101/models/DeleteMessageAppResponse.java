// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteMessageAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMessageAppResponseBody body;

    public static DeleteMessageAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageAppResponse self = new DeleteMessageAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMessageAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMessageAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMessageAppResponse setBody(DeleteMessageAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMessageAppResponseBody getBody() {
        return this.body;
    }

}
