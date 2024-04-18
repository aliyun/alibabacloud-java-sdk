// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCallProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCallProgressResponseBody body;

    public static GetCallProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallProgressResponse self = new GetCallProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetCallProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCallProgressResponse setBody(GetCallProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallProgressResponseBody getBody() {
        return this.body;
    }

}
