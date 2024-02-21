// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ShrinkNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ShrinkNodeResponseBody body;

    public static ShrinkNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ShrinkNodeResponse self = new ShrinkNodeResponse();
        return TeaModel.build(map, self);
    }

    public ShrinkNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShrinkNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ShrinkNodeResponse setBody(ShrinkNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ShrinkNodeResponseBody getBody() {
        return this.body;
    }

}
