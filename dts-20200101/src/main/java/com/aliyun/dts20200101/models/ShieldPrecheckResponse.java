// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ShieldPrecheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ShieldPrecheckResponseBody body;

    public static ShieldPrecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ShieldPrecheckResponse self = new ShieldPrecheckResponse();
        return TeaModel.build(map, self);
    }

    public ShieldPrecheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShieldPrecheckResponse setBody(ShieldPrecheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ShieldPrecheckResponseBody getBody() {
        return this.body;
    }

}
