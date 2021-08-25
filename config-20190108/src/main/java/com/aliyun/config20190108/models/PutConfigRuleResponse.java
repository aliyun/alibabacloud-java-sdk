// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutConfigRuleResponseBody body;

    public static PutConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutConfigRuleResponse self = new PutConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public PutConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutConfigRuleResponse setBody(PutConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutConfigRuleResponseBody getBody() {
        return this.body;
    }

}
