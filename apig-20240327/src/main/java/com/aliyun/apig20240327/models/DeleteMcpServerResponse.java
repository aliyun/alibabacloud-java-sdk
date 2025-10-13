// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMcpServerResponseBody body;

    public static DeleteMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcpServerResponse self = new DeleteMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMcpServerResponse setBody(DeleteMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcpServerResponseBody getBody() {
        return this.body;
    }

}
