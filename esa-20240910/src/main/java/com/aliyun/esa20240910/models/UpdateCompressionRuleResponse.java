// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCompressionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCompressionRuleResponseBody body;

    public static UpdateCompressionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCompressionRuleResponse self = new UpdateCompressionRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCompressionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCompressionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCompressionRuleResponse setBody(UpdateCompressionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCompressionRuleResponseBody getBody() {
        return this.body;
    }

}
