// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllPrivacyRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllPrivacyRuleResponseBody body;

    public static ListAllPrivacyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllPrivacyRuleResponse self = new ListAllPrivacyRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListAllPrivacyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllPrivacyRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllPrivacyRuleResponse setBody(ListAllPrivacyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllPrivacyRuleResponseBody getBody() {
        return this.body;
    }

}
