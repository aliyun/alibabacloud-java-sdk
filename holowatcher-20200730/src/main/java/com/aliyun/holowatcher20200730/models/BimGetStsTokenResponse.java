// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimGetStsTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BimGetStsTokenResponseBody body;

    public static BimGetStsTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        BimGetStsTokenResponse self = new BimGetStsTokenResponse();
        return TeaModel.build(map, self);
    }

    public BimGetStsTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimGetStsTokenResponse setBody(BimGetStsTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public BimGetStsTokenResponseBody getBody() {
        return this.body;
    }

}
