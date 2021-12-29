// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllPrivacyRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListAllPrivacyRuleResponse setBody(ListAllPrivacyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllPrivacyRuleResponseBody getBody() {
        return this.body;
    }

}
