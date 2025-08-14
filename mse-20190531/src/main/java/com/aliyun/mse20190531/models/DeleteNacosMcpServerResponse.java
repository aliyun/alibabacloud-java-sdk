// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNacosMcpServerResponseBody body;

    public static DeleteNacosMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosMcpServerResponse self = new DeleteNacosMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNacosMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNacosMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNacosMcpServerResponse setBody(DeleteNacosMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNacosMcpServerResponseBody getBody() {
        return this.body;
    }

}
