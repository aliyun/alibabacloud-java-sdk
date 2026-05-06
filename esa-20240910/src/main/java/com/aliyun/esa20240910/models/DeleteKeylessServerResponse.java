// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteKeylessServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKeylessServerResponseBody body;

    public static DeleteKeylessServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeylessServerResponse self = new DeleteKeylessServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKeylessServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKeylessServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKeylessServerResponse setBody(DeleteKeylessServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKeylessServerResponseBody getBody() {
        return this.body;
    }

}
