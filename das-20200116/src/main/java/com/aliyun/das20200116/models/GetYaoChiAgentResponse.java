// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetYaoChiAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYaoChiAgentResponseBody body;

    public static GetYaoChiAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYaoChiAgentResponse self = new GetYaoChiAgentResponse();
        return TeaModel.build(map, self);
    }

    public GetYaoChiAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYaoChiAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYaoChiAgentResponse setBody(GetYaoChiAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYaoChiAgentResponseBody getBody() {
        return this.body;
    }

}
