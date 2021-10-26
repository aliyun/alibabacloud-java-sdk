// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AbolishProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AbolishProductResponseBody body;

    public static AbolishProductResponse build(java.util.Map<String, ?> map) throws Exception {
        AbolishProductResponse self = new AbolishProductResponse();
        return TeaModel.build(map, self);
    }

    public AbolishProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbolishProductResponse setBody(AbolishProductResponseBody body) {
        this.body = body;
        return this;
    }
    public AbolishProductResponseBody getBody() {
        return this.body;
    }

}
