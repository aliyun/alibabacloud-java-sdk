// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSessionResponseBody body;

    public static GetSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSessionResponse self = new GetSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSessionResponse setBody(GetSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSessionResponseBody getBody() {
        return this.body;
    }

}
