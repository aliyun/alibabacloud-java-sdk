// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddSSLCertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddSSLCertResponse setBody(AddSSLCertResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSSLCertResponseBody getBody() {
        return this.body;
    }

}
