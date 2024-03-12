// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationClientSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApplicationClientSecretResponseBody body;

    public static EnableApplicationClientSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationClientSecretResponse self = new EnableApplicationClientSecretResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationClientSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationClientSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationClientSecretResponse setBody(EnableApplicationClientSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationClientSecretResponseBody getBody() {
        return this.body;
    }

}
