// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateGroupAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGroupAuthorizationRuleResponseBody body;

    public static UpdateGroupAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupAuthorizationRuleResponse self = new UpdateGroupAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGroupAuthorizationRuleResponse setBody(UpdateGroupAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
