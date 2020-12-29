// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteShortUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteShortUrlResponseBody body;

    public static DeleteShortUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteShortUrlResponse self = new DeleteShortUrlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteShortUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteShortUrlResponse setBody(DeleteShortUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteShortUrlResponseBody getBody() {
        return this.body;
    }

}
