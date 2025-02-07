// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRedirectRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRedirectRuleResponseBody body;

    public static UpdateRedirectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRedirectRuleResponse self = new UpdateRedirectRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRedirectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRedirectRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRedirectRuleResponse setBody(UpdateRedirectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRedirectRuleResponseBody getBody() {
        return this.body;
    }

}
