// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableTrustedOriginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableTrustedOriginResponseBody body;

    public static EnableTrustedOriginResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableTrustedOriginResponse self = new EnableTrustedOriginResponse();
        return TeaModel.build(map, self);
    }

    public EnableTrustedOriginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableTrustedOriginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableTrustedOriginResponse setBody(EnableTrustedOriginResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableTrustedOriginResponseBody getBody() {
        return this.body;
    }

}
