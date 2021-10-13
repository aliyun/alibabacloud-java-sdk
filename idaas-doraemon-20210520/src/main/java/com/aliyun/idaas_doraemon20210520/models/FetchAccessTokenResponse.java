// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class FetchAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FetchAccessTokenResponseBody body;

    public static FetchAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchAccessTokenResponse self = new FetchAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public FetchAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchAccessTokenResponse setBody(FetchAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchAccessTokenResponseBody getBody() {
        return this.body;
    }

}
