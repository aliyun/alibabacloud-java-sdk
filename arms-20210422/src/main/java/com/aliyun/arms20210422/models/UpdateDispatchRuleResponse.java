// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class UpdateDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDispatchRuleResponseBody body;

    public static UpdateDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDispatchRuleResponse self = new UpdateDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDispatchRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDispatchRuleResponse setBody(UpdateDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
