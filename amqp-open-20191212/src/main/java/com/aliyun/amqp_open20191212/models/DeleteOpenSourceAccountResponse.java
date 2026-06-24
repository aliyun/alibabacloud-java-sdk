// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteOpenSourceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOpenSourceAccountResponseBody body;

    public static DeleteOpenSourceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenSourceAccountResponse self = new DeleteOpenSourceAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOpenSourceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOpenSourceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOpenSourceAccountResponse setBody(DeleteOpenSourceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOpenSourceAccountResponseBody getBody() {
        return this.body;
    }

}
