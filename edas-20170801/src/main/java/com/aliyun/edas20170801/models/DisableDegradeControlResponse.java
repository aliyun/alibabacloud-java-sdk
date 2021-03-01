// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DisableDegradeControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableDegradeControlResponseBody body;

    public static DisableDegradeControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDegradeControlResponse self = new DisableDegradeControlResponse();
        return TeaModel.build(map, self);
    }

    public DisableDegradeControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDegradeControlResponse setBody(DisableDegradeControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDegradeControlResponseBody getBody() {
        return this.body;
    }

}
