// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddSSLCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSSLCertResponseBody body;

    public static AddSSLCertResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSSLCertResponse self = new AddSSLCertResponse();
        return TeaModel.build(map, self);
    }

    public AddSSLCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSSLCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSSLCertResponse setBody(AddSSLCertResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSSLCertResponseBody getBody() {
        return this.body;
    }

}
