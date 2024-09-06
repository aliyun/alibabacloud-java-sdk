// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentStatusResponseBody body;

    public static GetAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentStatusResponse self = new GetAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentStatusResponse setBody(GetAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentStatusResponseBody getBody() {
        return this.body;
    }

}
