// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScenegroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScenegroupResponseBody body;

    public static GetScenegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScenegroupResponse self = new GetScenegroupResponse();
        return TeaModel.build(map, self);
    }

    public GetScenegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScenegroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScenegroupResponse setBody(GetScenegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScenegroupResponseBody getBody() {
        return this.body;
    }

}
