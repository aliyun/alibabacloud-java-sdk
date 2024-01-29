// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteFlowRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFlowRulesResponseBody body;

    public static DeleteFlowRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowRulesResponse self = new DeleteFlowRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlowRulesResponse setBody(DeleteFlowRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowRulesResponseBody getBody() {
        return this.body;
    }

}
