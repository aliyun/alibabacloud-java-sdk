// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdatePointGrantRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePointGrantRuleResponseBody body;

    public static UpdatePointGrantRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePointGrantRuleResponse self = new UpdatePointGrantRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePointGrantRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePointGrantRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePointGrantRuleResponse setBody(UpdatePointGrantRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePointGrantRuleResponseBody getBody() {
        return this.body;
    }

}
