// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SkipPreCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SkipPreCheckResponseBody body;

    public static SkipPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipPreCheckResponse self = new SkipPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public SkipPreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipPreCheckResponse setBody(SkipPreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipPreCheckResponseBody getBody() {
        return this.body;
    }

}
