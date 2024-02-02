// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTurnCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTurnCredentialsResponseBody body;

    public static GetTurnCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTurnCredentialsResponse self = new GetTurnCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public GetTurnCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTurnCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTurnCredentialsResponse setBody(GetTurnCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTurnCredentialsResponseBody getBody() {
        return this.body;
    }

}
