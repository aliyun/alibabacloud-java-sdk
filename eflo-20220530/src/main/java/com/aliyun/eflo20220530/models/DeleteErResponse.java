// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteErResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteErResponseBody body;

    public static DeleteErResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteErResponse self = new DeleteErResponse();
        return TeaModel.build(map, self);
    }

    public DeleteErResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteErResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteErResponse setBody(DeleteErResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteErResponseBody getBody() {
        return this.body;
    }

}
