// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetModelInvocationSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelInvocationSummaryResponseBody body;

    public static GetModelInvocationSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelInvocationSummaryResponse self = new GetModelInvocationSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetModelInvocationSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelInvocationSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelInvocationSummaryResponse setBody(GetModelInvocationSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelInvocationSummaryResponseBody getBody() {
        return this.body;
    }

}
