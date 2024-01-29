// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetManagedRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetManagedRuleResponseBody body;

    public static GetManagedRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetManagedRuleResponse self = new GetManagedRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetManagedRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetManagedRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetManagedRuleResponse setBody(GetManagedRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetManagedRuleResponseBody getBody() {
        return this.body;
    }

}
