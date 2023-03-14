// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DisableLayer7CCResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableLayer7CCResponseBody body;

    public static DisableLayer7CCResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLayer7CCResponse self = new DisableLayer7CCResponse();
        return TeaModel.build(map, self);
    }

    public DisableLayer7CCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableLayer7CCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableLayer7CCResponse setBody(DisableLayer7CCResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableLayer7CCResponseBody getBody() {
        return this.body;
    }

}
