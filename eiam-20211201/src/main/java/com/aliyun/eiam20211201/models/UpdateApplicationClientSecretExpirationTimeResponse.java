// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationClientSecretExpirationTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationClientSecretExpirationTimeResponseBody body;

    public static UpdateApplicationClientSecretExpirationTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationClientSecretExpirationTimeResponse self = new UpdateApplicationClientSecretExpirationTimeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationClientSecretExpirationTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationClientSecretExpirationTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationClientSecretExpirationTimeResponse setBody(UpdateApplicationClientSecretExpirationTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationClientSecretExpirationTimeResponseBody getBody() {
        return this.body;
    }

}
