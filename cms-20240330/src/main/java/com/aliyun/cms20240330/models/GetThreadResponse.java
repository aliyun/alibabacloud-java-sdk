// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetThreadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetThreadResponseBody body;

    public static GetThreadResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThreadResponse self = new GetThreadResponse();
        return TeaModel.build(map, self);
    }

    public GetThreadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThreadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetThreadResponse setBody(GetThreadResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThreadResponseBody getBody() {
        return this.body;
    }

}
