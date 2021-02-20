// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableWebCCRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableWebCCRuleResponseBody body;

    public static EnableWebCCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableWebCCRuleResponse self = new EnableWebCCRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableWebCCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableWebCCRuleResponse setBody(EnableWebCCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableWebCCRuleResponseBody getBody() {
        return this.body;
    }

}
