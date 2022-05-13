// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateSSLCertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSSLCertResponseBody body;

    public static UpdateSSLCertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSSLCertResponse self = new UpdateSSLCertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSSLCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSSLCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSSLCertResponse setBody(UpdateSSLCertResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSSLCertResponseBody getBody() {
        return this.body;
    }

}
