// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUserWafRulesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserWafRulesetResponseBody body;

    public static CreateUserWafRulesetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWafRulesetResponse self = new CreateUserWafRulesetResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserWafRulesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserWafRulesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserWafRulesetResponse setBody(CreateUserWafRulesetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserWafRulesetResponseBody getBody() {
        return this.body;
    }

}
