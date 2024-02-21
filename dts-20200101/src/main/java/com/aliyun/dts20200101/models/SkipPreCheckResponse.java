// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SkipPreCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SkipPreCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SkipPreCheckResponse setBody(SkipPreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipPreCheckResponseBody getBody() {
        return this.body;
    }

}
