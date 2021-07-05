// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210622.models;

import com.aliyun.tea.*;

public class GetUserByTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserByTokenResponseBody body;

    public static GetUserByTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserByTokenResponse self = new GetUserByTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetUserByTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserByTokenResponse setBody(GetUserByTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserByTokenResponseBody getBody() {
        return this.body;
    }

}
