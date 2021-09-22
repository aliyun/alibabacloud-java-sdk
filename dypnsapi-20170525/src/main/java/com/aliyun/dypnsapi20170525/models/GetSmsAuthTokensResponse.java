// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsAuthTokensResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSmsAuthTokensResponseBody body;

    public static GetSmsAuthTokensResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmsAuthTokensResponse self = new GetSmsAuthTokensResponse();
        return TeaModel.build(map, self);
    }

    public GetSmsAuthTokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmsAuthTokensResponse setBody(GetSmsAuthTokensResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmsAuthTokensResponseBody getBody() {
        return this.body;
    }

}
