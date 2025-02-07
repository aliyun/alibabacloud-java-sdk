// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpRequestHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHttpRequestHeaderModificationRuleResponseBody body;

    public static CreateHttpRequestHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpRequestHeaderModificationRuleResponse self = new CreateHttpRequestHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateHttpRequestHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHttpRequestHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHttpRequestHeaderModificationRuleResponse setBody(CreateHttpRequestHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHttpRequestHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
