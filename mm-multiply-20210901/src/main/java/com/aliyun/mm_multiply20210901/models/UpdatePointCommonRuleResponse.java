// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdatePointCommonRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePointCommonRuleResponseBody body;

    public static UpdatePointCommonRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePointCommonRuleResponse self = new UpdatePointCommonRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePointCommonRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePointCommonRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePointCommonRuleResponse setBody(UpdatePointCommonRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePointCommonRuleResponseBody getBody() {
        return this.body;
    }

}
