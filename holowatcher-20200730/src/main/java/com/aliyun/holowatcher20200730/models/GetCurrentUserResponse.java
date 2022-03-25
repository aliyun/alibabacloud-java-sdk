// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetCurrentUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCurrentUserResponseBody body;

    public static GetCurrentUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentUserResponse self = new GetCurrentUserResponse();
        return TeaModel.build(map, self);
    }

    public GetCurrentUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCurrentUserResponse setBody(GetCurrentUserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCurrentUserResponseBody getBody() {
        return this.body;
    }

}
