// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteCustomTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomTextResponseBody body;

    public static DeleteCustomTextResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTextResponse self = new DeleteCustomTextResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomTextResponse setBody(DeleteCustomTextResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomTextResponseBody getBody() {
        return this.body;
    }

}
