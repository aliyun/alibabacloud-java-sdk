// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpRequestHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHttpRequestHeaderModificationRuleResponseBody body;

    public static DeleteHttpRequestHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpRequestHeaderModificationRuleResponse self = new DeleteHttpRequestHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHttpRequestHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHttpRequestHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHttpRequestHeaderModificationRuleResponse setBody(DeleteHttpRequestHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHttpRequestHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
