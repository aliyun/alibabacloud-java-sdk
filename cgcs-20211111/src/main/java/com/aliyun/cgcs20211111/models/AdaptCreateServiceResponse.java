// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AdaptCreateServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AdaptCreateServiceResponseBody body;

    public static AdaptCreateServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AdaptCreateServiceResponse self = new AdaptCreateServiceResponse();
        return TeaModel.build(map, self);
    }

    public AdaptCreateServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdaptCreateServiceResponse setBody(AdaptCreateServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AdaptCreateServiceResponseBody getBody() {
        return this.body;
    }

}
