// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateRepoBuildRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRepoBuildRuleResponse setBody(CreateRepoBuildRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoBuildRuleResponseBody getBody() {
        return this.body;
    }

}
