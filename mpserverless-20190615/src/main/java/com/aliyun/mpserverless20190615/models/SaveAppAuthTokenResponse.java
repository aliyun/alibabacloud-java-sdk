// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveAppAuthTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveAppAuthTokenResponseBody body;

    public static SaveAppAuthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAppAuthTokenResponse self = new SaveAppAuthTokenResponse();
        return TeaModel.build(map, self);
    }

    public SaveAppAuthTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAppAuthTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveAppAuthTokenResponse setBody(SaveAppAuthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAppAuthTokenResponseBody getBody() {
        return this.body;
    }

}
