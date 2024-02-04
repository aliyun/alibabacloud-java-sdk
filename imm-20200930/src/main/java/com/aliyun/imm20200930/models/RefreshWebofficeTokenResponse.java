// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RefreshWebofficeTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshWebofficeTokenResponseBody body;

    public static RefreshWebofficeTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshWebofficeTokenResponse self = new RefreshWebofficeTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshWebofficeTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshWebofficeTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshWebofficeTokenResponse setBody(RefreshWebofficeTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshWebofficeTokenResponseBody getBody() {
        return this.body;
    }

}
