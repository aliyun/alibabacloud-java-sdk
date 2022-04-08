// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class ExtractPhoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExtractPhoneResponseBody body;

    public static ExtractPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractPhoneResponse self = new ExtractPhoneResponse();
        return TeaModel.build(map, self);
    }

    public ExtractPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractPhoneResponse setBody(ExtractPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractPhoneResponseBody getBody() {
        return this.body;
    }

}
