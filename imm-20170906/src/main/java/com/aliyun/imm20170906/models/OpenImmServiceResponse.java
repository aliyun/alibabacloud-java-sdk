// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class OpenImmServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenImmServiceResponseBody body;

    public static OpenImmServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenImmServiceResponse self = new OpenImmServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenImmServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenImmServiceResponse setBody(OpenImmServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenImmServiceResponseBody getBody() {
        return this.body;
    }

}
