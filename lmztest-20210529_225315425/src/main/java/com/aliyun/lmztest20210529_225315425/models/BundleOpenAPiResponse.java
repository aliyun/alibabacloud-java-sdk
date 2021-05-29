// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210529_225315425.models;

import com.aliyun.tea.*;

public class BundleOpenAPiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BundleOpenAPiResponseBody body;

    public static BundleOpenAPiResponse build(java.util.Map<String, ?> map) throws Exception {
        BundleOpenAPiResponse self = new BundleOpenAPiResponse();
        return TeaModel.build(map, self);
    }

    public BundleOpenAPiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BundleOpenAPiResponse setBody(BundleOpenAPiResponseBody body) {
        this.body = body;
        return this;
    }
    public BundleOpenAPiResponseBody getBody() {
        return this.body;
    }

}
