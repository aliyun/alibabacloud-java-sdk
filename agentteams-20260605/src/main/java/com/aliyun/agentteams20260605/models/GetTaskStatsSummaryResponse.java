// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTaskStatsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskStatsSummaryResponseBody body;

    public static GetTaskStatsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatsSummaryResponse self = new GetTaskStatsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskStatsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskStatsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskStatsSummaryResponse setBody(GetTaskStatsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskStatsSummaryResponseBody getBody() {
        return this.body;
    }

}
