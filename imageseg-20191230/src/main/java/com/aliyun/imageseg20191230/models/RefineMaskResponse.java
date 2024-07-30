// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class RefineMaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefineMaskResponseBody body;

    public static RefineMaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RefineMaskResponse self = new RefineMaskResponse();
        return TeaModel.build(map, self);
    }

    public RefineMaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefineMaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefineMaskResponse setBody(RefineMaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RefineMaskResponseBody getBody() {
        return this.body;
    }

}
