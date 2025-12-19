// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenForUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkloadAccessTokenForUserIdResponseBody body;

    public static GetWorkloadAccessTokenForUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadAccessTokenForUserIdResponse self = new GetWorkloadAccessTokenForUserIdResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkloadAccessTokenForUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkloadAccessTokenForUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkloadAccessTokenForUserIdResponse setBody(GetWorkloadAccessTokenForUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkloadAccessTokenForUserIdResponseBody getBody() {
        return this.body;
    }

}
