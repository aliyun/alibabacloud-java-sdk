// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteOsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOsVersionResponseBody body;

    public static DeleteOsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOsVersionResponse self = new DeleteOsVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOsVersionResponse setBody(DeleteOsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOsVersionResponseBody getBody() {
        return this.body;
    }

}
