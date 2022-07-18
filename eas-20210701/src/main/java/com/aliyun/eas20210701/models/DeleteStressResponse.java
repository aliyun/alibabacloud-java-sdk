// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteStressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteStressResponseBody body;

    public static DeleteStressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStressResponse self = new DeleteStressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStressResponse setBody(DeleteStressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStressResponseBody getBody() {
        return this.body;
    }

}
