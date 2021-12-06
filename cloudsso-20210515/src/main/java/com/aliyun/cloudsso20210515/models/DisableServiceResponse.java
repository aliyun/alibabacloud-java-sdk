// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DisableServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableServiceResponseBody body;

    public static DisableServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableServiceResponse self = new DisableServiceResponse();
        return TeaModel.build(map, self);
    }

    public DisableServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableServiceResponse setBody(DisableServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableServiceResponseBody getBody() {
        return this.body;
    }

}
