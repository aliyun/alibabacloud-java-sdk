// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRuleActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRuleActionResponseBody body;

    public static CreateRuleActionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleActionResponse self = new CreateRuleActionResponse();
        return TeaModel.build(map, self);
    }

    public CreateRuleActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRuleActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRuleActionResponse setBody(CreateRuleActionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRuleActionResponseBody getBody() {
        return this.body;
    }

}
