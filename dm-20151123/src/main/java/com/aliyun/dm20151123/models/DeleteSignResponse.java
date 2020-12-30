// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSignResponseBody body;

    public static DeleteSignResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSignResponse self = new DeleteSignResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSignResponse setBody(DeleteSignResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSignResponseBody getBody() {
        return this.body;
    }

}
