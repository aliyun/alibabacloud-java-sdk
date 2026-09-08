// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetParseProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetParseProgressResponseBody body;

    public static GetParseProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParseProgressResponse self = new GetParseProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetParseProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParseProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetParseProgressResponse setBody(GetParseProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParseProgressResponseBody getBody() {
        return this.body;
    }

}
