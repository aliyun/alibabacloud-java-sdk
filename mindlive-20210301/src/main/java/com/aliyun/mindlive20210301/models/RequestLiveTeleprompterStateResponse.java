// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestLiveTeleprompterStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RequestLiveTeleprompterStateResponseBody body;

    public static RequestLiveTeleprompterStateResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestLiveTeleprompterStateResponse self = new RequestLiveTeleprompterStateResponse();
        return TeaModel.build(map, self);
    }

    public RequestLiveTeleprompterStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestLiveTeleprompterStateResponse setBody(RequestLiveTeleprompterStateResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestLiveTeleprompterStateResponseBody getBody() {
        return this.body;
    }

}
