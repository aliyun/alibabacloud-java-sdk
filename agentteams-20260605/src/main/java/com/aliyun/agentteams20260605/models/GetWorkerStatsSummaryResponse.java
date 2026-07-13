// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerStatsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkerStatsSummaryResponseBody body;

    public static GetWorkerStatsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerStatsSummaryResponse self = new GetWorkerStatsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkerStatsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkerStatsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkerStatsSummaryResponse setBody(GetWorkerStatsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkerStatsSummaryResponseBody getBody() {
        return this.body;
    }

}
