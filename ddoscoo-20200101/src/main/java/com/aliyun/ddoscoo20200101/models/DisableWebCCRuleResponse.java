// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableWebCCRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableWebCCRuleResponseBody body;

    public static DisableWebCCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableWebCCRuleResponse self = new DisableWebCCRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableWebCCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableWebCCRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableWebCCRuleResponse setBody(DisableWebCCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableWebCCRuleResponseBody getBody() {
        return this.body;
    }

}
