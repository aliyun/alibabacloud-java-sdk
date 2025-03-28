// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SkipFullJobTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SkipFullJobTableResponseBody body;

    public static SkipFullJobTableResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipFullJobTableResponse self = new SkipFullJobTableResponse();
        return TeaModel.build(map, self);
    }

    public SkipFullJobTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipFullJobTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SkipFullJobTableResponse setBody(SkipFullJobTableResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipFullJobTableResponseBody getBody() {
        return this.body;
    }

}
