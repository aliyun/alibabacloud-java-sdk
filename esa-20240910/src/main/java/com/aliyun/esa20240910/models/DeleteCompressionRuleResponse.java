// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteCompressionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCompressionRuleResponseBody body;

    public static DeleteCompressionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompressionRuleResponse self = new DeleteCompressionRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCompressionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCompressionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCompressionRuleResponse setBody(DeleteCompressionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCompressionRuleResponseBody getBody() {
        return this.body;
    }

}
