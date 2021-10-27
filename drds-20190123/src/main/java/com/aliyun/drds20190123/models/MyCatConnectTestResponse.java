// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class MyCatConnectTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MyCatConnectTestResponseBody body;

    public static MyCatConnectTestResponse build(java.util.Map<String, ?> map) throws Exception {
        MyCatConnectTestResponse self = new MyCatConnectTestResponse();
        return TeaModel.build(map, self);
    }

    public MyCatConnectTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MyCatConnectTestResponse setBody(MyCatConnectTestResponseBody body) {
        this.body = body;
        return this;
    }
    public MyCatConnectTestResponseBody getBody() {
        return this.body;
    }

}
