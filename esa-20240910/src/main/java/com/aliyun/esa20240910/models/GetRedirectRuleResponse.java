// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRedirectRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRedirectRuleResponseBody body;

    public static GetRedirectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRedirectRuleResponse self = new GetRedirectRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetRedirectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRedirectRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRedirectRuleResponse setBody(GetRedirectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRedirectRuleResponseBody getBody() {
        return this.body;
    }

}
