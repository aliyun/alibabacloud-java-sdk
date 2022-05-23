// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateMockRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMockRuleResponseBody body;

    public static UpdateMockRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMockRuleResponse self = new UpdateMockRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMockRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMockRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMockRuleResponse setBody(UpdateMockRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMockRuleResponseBody getBody() {
        return this.body;
    }

}
