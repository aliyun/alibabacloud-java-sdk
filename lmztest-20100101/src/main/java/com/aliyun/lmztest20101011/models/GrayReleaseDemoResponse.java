// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class GrayReleaseDemoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrayReleaseDemoResponseBody body;

    public static GrayReleaseDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        GrayReleaseDemoResponse self = new GrayReleaseDemoResponse();
        return TeaModel.build(map, self);
    }

    public GrayReleaseDemoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrayReleaseDemoResponse setBody(GrayReleaseDemoResponseBody body) {
        this.body = body;
        return this;
    }
    public GrayReleaseDemoResponseBody getBody() {
        return this.body;
    }

}
