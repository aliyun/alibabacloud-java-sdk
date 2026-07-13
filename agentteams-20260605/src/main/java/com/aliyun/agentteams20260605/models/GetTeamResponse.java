// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTeamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTeamResponseBody body;

    public static GetTeamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTeamResponse self = new GetTeamResponse();
        return TeaModel.build(map, self);
    }

    public GetTeamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTeamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTeamResponse setBody(GetTeamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTeamResponseBody getBody() {
        return this.body;
    }

}
