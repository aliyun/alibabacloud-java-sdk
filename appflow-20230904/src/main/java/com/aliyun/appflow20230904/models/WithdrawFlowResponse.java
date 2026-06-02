// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class WithdrawFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WithdrawFlowResponseBody body;

    public static WithdrawFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        WithdrawFlowResponse self = new WithdrawFlowResponse();
        return TeaModel.build(map, self);
    }

    public WithdrawFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WithdrawFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WithdrawFlowResponse setBody(WithdrawFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public WithdrawFlowResponseBody getBody() {
        return this.body;
    }

}
