// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardLatestFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCardLatestFlowResponseBody body;

    public static GetCardLatestFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardLatestFlowResponse self = new GetCardLatestFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetCardLatestFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardLatestFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCardLatestFlowResponse setBody(GetCardLatestFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardLatestFlowResponseBody getBody() {
        return this.body;
    }

}
