// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class EnableDegradeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDegradeRuleResponseBody body;

    public static EnableDegradeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDegradeRuleResponse self = new EnableDegradeRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableDegradeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDegradeRuleResponse setBody(EnableDegradeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDegradeRuleResponseBody getBody() {
        return this.body;
    }

}
