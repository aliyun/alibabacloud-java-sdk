// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomTextResponseBody body;

    public static GetCustomTextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomTextResponse self = new GetCustomTextResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomTextResponse setBody(GetCustomTextResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomTextResponseBody getBody() {
        return this.body;
    }

}
