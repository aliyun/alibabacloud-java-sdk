// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class SharePrivacyRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SharePrivacyRuleResponseBody body;

    public static SharePrivacyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SharePrivacyRuleResponse self = new SharePrivacyRuleResponse();
        return TeaModel.build(map, self);
    }

    public SharePrivacyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SharePrivacyRuleResponse setBody(SharePrivacyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SharePrivacyRuleResponseBody getBody() {
        return this.body;
    }

}
