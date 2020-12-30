// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class EnableAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAccountResponseBody body;

    public static EnableAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAccountResponse self = new EnableAccountResponse();
        return TeaModel.build(map, self);
    }

    public EnableAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAccountResponse setBody(EnableAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAccountResponseBody getBody() {
        return this.body;
    }

}
