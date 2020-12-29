// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddShortUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddShortUrlResponseBody body;

    public static AddShortUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        AddShortUrlResponse self = new AddShortUrlResponse();
        return TeaModel.build(map, self);
    }

    public AddShortUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddShortUrlResponse setBody(AddShortUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public AddShortUrlResponseBody getBody() {
        return this.body;
    }

}
