// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetAgentInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentInfoResponseBody body;

    public static GetAgentInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentInfoResponse self = new GetAgentInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentInfoResponse setBody(GetAgentInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentInfoResponseBody getBody() {
        return this.body;
    }

}
