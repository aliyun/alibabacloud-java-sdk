// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetVerifyTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVerifyTokenResponseBody body;

    public static GetVerifyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVerifyTokenResponse self = new GetVerifyTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetVerifyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVerifyTokenResponse setBody(GetVerifyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVerifyTokenResponseBody getBody() {
        return this.body;
    }

}
