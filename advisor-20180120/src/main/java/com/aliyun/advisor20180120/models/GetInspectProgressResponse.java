// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetInspectProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInspectProgressResponseBody body;

    public static GetInspectProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInspectProgressResponse self = new GetInspectProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetInspectProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInspectProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInspectProgressResponse setBody(GetInspectProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInspectProgressResponseBody getBody() {
        return this.body;
    }

}
