// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class ActiveProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActiveProductResponseBody body;

    public static ActiveProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveProductResponse self = new ActiveProductResponse();
        return TeaModel.build(map, self);
    }

    public ActiveProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveProductResponse setBody(ActiveProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveProductResponseBody getBody() {
        return this.body;
    }

}
