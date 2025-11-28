// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UpdatePrivacyRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrivacyRuleResponseBody body;

    public static UpdatePrivacyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivacyRuleResponse self = new UpdatePrivacyRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrivacyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrivacyRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrivacyRuleResponse setBody(UpdatePrivacyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivacyRuleResponseBody getBody() {
        return this.body;
    }

}
