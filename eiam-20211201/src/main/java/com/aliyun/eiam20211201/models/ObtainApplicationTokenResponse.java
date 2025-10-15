// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainApplicationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ObtainApplicationTokenResponseBody body;

    public static ObtainApplicationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ObtainApplicationTokenResponse self = new ObtainApplicationTokenResponse();
        return TeaModel.build(map, self);
    }

    public ObtainApplicationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ObtainApplicationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ObtainApplicationTokenResponse setBody(ObtainApplicationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ObtainApplicationTokenResponseBody getBody() {
        return this.body;
    }

}
