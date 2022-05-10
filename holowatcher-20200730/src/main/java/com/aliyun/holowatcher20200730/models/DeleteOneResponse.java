// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DeleteOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOneResponseBody body;

    public static DeleteOneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOneResponse self = new DeleteOneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOneResponse setBody(DeleteOneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOneResponseBody getBody() {
        return this.body;
    }

}
