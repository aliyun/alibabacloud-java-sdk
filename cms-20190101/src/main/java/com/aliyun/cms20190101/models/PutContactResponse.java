// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutContactResponseBody body;

    public static PutContactResponse build(java.util.Map<String, ?> map) throws Exception {
        PutContactResponse self = new PutContactResponse();
        return TeaModel.build(map, self);
    }

    public PutContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutContactResponse setBody(PutContactResponseBody body) {
        this.body = body;
        return this;
    }
    public PutContactResponseBody getBody() {
        return this.body;
    }

}
