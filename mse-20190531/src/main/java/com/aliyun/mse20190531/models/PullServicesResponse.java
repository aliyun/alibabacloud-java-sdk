// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class PullServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PullServicesResponseBody body;

    public static PullServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        PullServicesResponse self = new PullServicesResponse();
        return TeaModel.build(map, self);
    }

    public PullServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PullServicesResponse setBody(PullServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public PullServicesResponseBody getBody() {
        return this.body;
    }

}
