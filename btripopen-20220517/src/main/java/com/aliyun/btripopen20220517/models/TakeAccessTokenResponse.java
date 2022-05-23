// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220517.models;

import com.aliyun.tea.*;

public class TakeAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TakeAccessTokenResponseBody body;

    public static TakeAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        TakeAccessTokenResponse self = new TakeAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public TakeAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TakeAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TakeAccessTokenResponse setBody(TakeAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public TakeAccessTokenResponseBody getBody() {
        return this.body;
    }

}
