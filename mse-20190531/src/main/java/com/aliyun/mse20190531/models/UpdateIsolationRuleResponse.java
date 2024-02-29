// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIsolationRuleResponseBody body;

    public static UpdateIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIsolationRuleResponse self = new UpdateIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIsolationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIsolationRuleResponse setBody(UpdateIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
