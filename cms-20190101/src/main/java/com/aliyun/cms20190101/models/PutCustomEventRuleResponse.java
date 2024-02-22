// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomEventRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutCustomEventRuleResponseBody body;

    public static PutCustomEventRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutCustomEventRuleResponse self = new PutCustomEventRuleResponse();
        return TeaModel.build(map, self);
    }

    public PutCustomEventRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutCustomEventRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutCustomEventRuleResponse setBody(PutCustomEventRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutCustomEventRuleResponseBody getBody() {
        return this.body;
    }

}
