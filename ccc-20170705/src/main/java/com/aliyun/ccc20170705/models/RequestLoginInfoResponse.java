// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RequestLoginInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RequestLoginInfoResponseBody body;

    public static RequestLoginInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestLoginInfoResponse self = new RequestLoginInfoResponse();
        return TeaModel.build(map, self);
    }

    public RequestLoginInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestLoginInfoResponse setBody(RequestLoginInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestLoginInfoResponseBody getBody() {
        return this.body;
    }

}
