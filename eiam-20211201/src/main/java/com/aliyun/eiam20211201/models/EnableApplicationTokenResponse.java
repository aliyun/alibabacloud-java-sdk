// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApplicationTokenResponseBody body;

    public static EnableApplicationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationTokenResponse self = new EnableApplicationTokenResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationTokenResponse setBody(EnableApplicationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationTokenResponseBody getBody() {
        return this.body;
    }

}
