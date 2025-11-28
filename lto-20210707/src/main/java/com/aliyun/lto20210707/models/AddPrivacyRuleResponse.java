// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddPrivacyRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPrivacyRuleResponseBody body;

    public static AddPrivacyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPrivacyRuleResponse self = new AddPrivacyRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddPrivacyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPrivacyRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPrivacyRuleResponse setBody(AddPrivacyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPrivacyRuleResponseBody getBody() {
        return this.body;
    }

}
