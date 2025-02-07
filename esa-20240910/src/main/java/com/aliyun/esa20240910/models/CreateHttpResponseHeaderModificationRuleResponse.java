// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpResponseHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHttpResponseHeaderModificationRuleResponseBody body;

    public static CreateHttpResponseHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpResponseHeaderModificationRuleResponse self = new CreateHttpResponseHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateHttpResponseHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHttpResponseHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHttpResponseHeaderModificationRuleResponse setBody(CreateHttpResponseHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHttpResponseHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
