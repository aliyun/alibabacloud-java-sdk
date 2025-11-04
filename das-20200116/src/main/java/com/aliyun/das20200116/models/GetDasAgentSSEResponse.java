// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasAgentSSEResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDasAgentSSEResponseBody body;

    public static GetDasAgentSSEResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDasAgentSSEResponse self = new GetDasAgentSSEResponse();
        return TeaModel.build(map, self);
    }

    public GetDasAgentSSEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDasAgentSSEResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDasAgentSSEResponse setBody(GetDasAgentSSEResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDasAgentSSEResponseBody getBody() {
        return this.body;
    }

}
