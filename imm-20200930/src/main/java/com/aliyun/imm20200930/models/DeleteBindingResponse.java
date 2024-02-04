// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteBindingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBindingResponseBody body;

    public static DeleteBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindingResponse self = new DeleteBindingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBindingResponse setBody(DeleteBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBindingResponseBody getBody() {
        return this.body;
    }

}
