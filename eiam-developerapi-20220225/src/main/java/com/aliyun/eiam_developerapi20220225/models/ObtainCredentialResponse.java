// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ObtainCredentialResponseBody body;

    public static ObtainCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        ObtainCredentialResponse self = new ObtainCredentialResponse();
        return TeaModel.build(map, self);
    }

    public ObtainCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ObtainCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ObtainCredentialResponse setBody(ObtainCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public ObtainCredentialResponseBody getBody() {
        return this.body;
    }

}
