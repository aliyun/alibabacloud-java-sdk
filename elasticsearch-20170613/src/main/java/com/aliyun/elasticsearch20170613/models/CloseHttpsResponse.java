// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CloseHttpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseHttpsResponseBody body;

    public static CloseHttpsResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseHttpsResponse self = new CloseHttpsResponse();
        return TeaModel.build(map, self);
    }

    public CloseHttpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseHttpsResponse setBody(CloseHttpsResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseHttpsResponseBody getBody() {
        return this.body;
    }

}
