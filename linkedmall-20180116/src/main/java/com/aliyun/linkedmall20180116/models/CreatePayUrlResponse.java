// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreatePayUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePayUrlResponseBody body;

    public static CreatePayUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePayUrlResponse self = new CreatePayUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreatePayUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePayUrlResponse setBody(CreatePayUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePayUrlResponseBody getBody() {
        return this.body;
    }

}
