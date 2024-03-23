// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteCodeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCodeSourceResponseBody body;

    public static DeleteCodeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCodeSourceResponse self = new DeleteCodeSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCodeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCodeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCodeSourceResponse setBody(DeleteCodeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCodeSourceResponseBody getBody() {
        return this.body;
    }

}
