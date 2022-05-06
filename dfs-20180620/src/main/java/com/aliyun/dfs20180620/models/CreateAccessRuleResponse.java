// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateAccessRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAccessRuleResponseBody body;

    public static CreateAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessRuleResponse self = new CreateAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessRuleResponse setBody(CreateAccessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessRuleResponseBody getBody() {
        return this.body;
    }

}
