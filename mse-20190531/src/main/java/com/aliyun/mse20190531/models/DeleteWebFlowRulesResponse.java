// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteWebFlowRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWebFlowRulesResponseBody body;

    public static DeleteWebFlowRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebFlowRulesResponse self = new DeleteWebFlowRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebFlowRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebFlowRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebFlowRulesResponse setBody(DeleteWebFlowRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebFlowRulesResponseBody getBody() {
        return this.body;
    }

}
