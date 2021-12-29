// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UpdatePrivacyRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdatePrivacyRuleResponse setBody(UpdatePrivacyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivacyRuleResponseBody getBody() {
        return this.body;
    }

}
