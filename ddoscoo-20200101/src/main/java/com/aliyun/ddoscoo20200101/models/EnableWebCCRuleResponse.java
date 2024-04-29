// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableWebCCRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableWebCCRuleResponseBody body;

    public static EnableWebCCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableWebCCRuleResponse self = new EnableWebCCRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableWebCCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableWebCCRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableWebCCRuleResponse setBody(EnableWebCCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableWebCCRuleResponseBody getBody() {
        return this.body;
    }

}
