// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveAppAuthTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveAppAuthTokenResponse setBody(SaveAppAuthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAppAuthTokenResponseBody getBody() {
        return this.body;
    }

}
