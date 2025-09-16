// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpIncomingResponseHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHttpIncomingResponseHeaderModificationRuleResponseBody body;

    public static CreateHttpIncomingResponseHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpIncomingResponseHeaderModificationRuleResponse self = new CreateHttpIncomingResponseHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateHttpIncomingResponseHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleResponse setBody(CreateHttpIncomingResponseHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHttpIncomingResponseHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
