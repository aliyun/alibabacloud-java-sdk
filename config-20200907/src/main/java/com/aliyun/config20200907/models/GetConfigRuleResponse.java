// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConfigRuleResponseBody body;

    public static GetConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleResponse self = new GetConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigRuleResponse setBody(GetConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigRuleResponseBody getBody() {
        return this.body;
    }

}
