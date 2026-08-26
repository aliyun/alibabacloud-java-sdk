// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableTrustedOriginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableTrustedOriginResponseBody body;

    public static DisableTrustedOriginResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableTrustedOriginResponse self = new DisableTrustedOriginResponse();
        return TeaModel.build(map, self);
    }

    public DisableTrustedOriginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableTrustedOriginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableTrustedOriginResponse setBody(DisableTrustedOriginResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableTrustedOriginResponseBody getBody() {
        return this.body;
    }

}
