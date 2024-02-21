// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRedisAllSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRedisAllSessionResponseBody body;

    public static GetRedisAllSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRedisAllSessionResponse self = new GetRedisAllSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetRedisAllSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRedisAllSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRedisAllSessionResponse setBody(GetRedisAllSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRedisAllSessionResponseBody getBody() {
        return this.body;
    }

}
