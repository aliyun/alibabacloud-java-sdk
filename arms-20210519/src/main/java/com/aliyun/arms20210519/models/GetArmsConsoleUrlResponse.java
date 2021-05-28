// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetArmsConsoleUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetArmsConsoleUrlResponseBody body;

    public static GetArmsConsoleUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArmsConsoleUrlResponse self = new GetArmsConsoleUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetArmsConsoleUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArmsConsoleUrlResponse setBody(GetArmsConsoleUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArmsConsoleUrlResponseBody getBody() {
        return this.body;
    }

}
