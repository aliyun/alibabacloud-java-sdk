// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CheckMfaBindResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckMfaBindResponseBody body;

    public static CheckMfaBindResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMfaBindResponse self = new CheckMfaBindResponse();
        return TeaModel.build(map, self);
    }

    public CheckMfaBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMfaBindResponse setBody(CheckMfaBindResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMfaBindResponseBody getBody() {
        return this.body;
    }

}
