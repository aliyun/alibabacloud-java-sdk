// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRepoBuildRuleResponseBody body;

    public static CreateRepoBuildRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoBuildRuleResponse self = new CreateRepoBuildRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepoBuildRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepoBuildRuleResponse setBody(CreateRepoBuildRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoBuildRuleResponseBody getBody() {
        return this.body;
    }

}
