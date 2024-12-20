// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentBasisStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentBasisStatusResponseBody body;

    public static GetAgentBasisStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBasisStatusResponse self = new GetAgentBasisStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentBasisStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentBasisStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentBasisStatusResponse setBody(GetAgentBasisStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentBasisStatusResponseBody getBody() {
        return this.body;
    }

}
