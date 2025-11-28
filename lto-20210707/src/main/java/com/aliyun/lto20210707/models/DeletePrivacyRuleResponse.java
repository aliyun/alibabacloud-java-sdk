// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DeletePrivacyRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrivacyRuleResponseBody body;

    public static DeletePrivacyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivacyRuleResponse self = new DeletePrivacyRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrivacyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrivacyRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrivacyRuleResponse setBody(DeletePrivacyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrivacyRuleResponseBody getBody() {
        return this.body;
    }

}
