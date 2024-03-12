// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainApplicationClientSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ObtainApplicationClientSecretResponseBody body;

    public static ObtainApplicationClientSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        ObtainApplicationClientSecretResponse self = new ObtainApplicationClientSecretResponse();
        return TeaModel.build(map, self);
    }

    public ObtainApplicationClientSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ObtainApplicationClientSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ObtainApplicationClientSecretResponse setBody(ObtainApplicationClientSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public ObtainApplicationClientSecretResponseBody getBody() {
        return this.body;
    }

}
