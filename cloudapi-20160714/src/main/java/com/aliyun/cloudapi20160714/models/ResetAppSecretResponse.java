// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ResetAppSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAppSecretResponseBody body;

    public static ResetAppSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAppSecretResponse self = new ResetAppSecretResponse();
        return TeaModel.build(map, self);
    }

    public ResetAppSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAppSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAppSecretResponse setBody(ResetAppSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAppSecretResponseBody getBody() {
        return this.body;
    }

}
