// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableBrandResponseBody body;

    public static DisableBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableBrandResponse self = new DisableBrandResponse();
        return TeaModel.build(map, self);
    }

    public DisableBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableBrandResponse setBody(DisableBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableBrandResponseBody getBody() {
        return this.body;
    }

}
