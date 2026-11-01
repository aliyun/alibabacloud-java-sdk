// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteAccessApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccessApplicationResponseBody body;

    public static DeleteAccessApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessApplicationResponse self = new DeleteAccessApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessApplicationResponse setBody(DeleteAccessApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessApplicationResponseBody getBody() {
        return this.body;
    }

}
