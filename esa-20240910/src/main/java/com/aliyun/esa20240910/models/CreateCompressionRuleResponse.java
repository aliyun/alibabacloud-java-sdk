// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCompressionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCompressionRuleResponseBody body;

    public static CreateCompressionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCompressionRuleResponse self = new CreateCompressionRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCompressionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCompressionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCompressionRuleResponse setBody(CreateCompressionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCompressionRuleResponseBody getBody() {
        return this.body;
    }

}
