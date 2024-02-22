// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutEventRuleResponseBody body;

    public static PutEventRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEventRuleResponse self = new PutEventRuleResponse();
        return TeaModel.build(map, self);
    }

    public PutEventRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEventRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutEventRuleResponse setBody(PutEventRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEventRuleResponseBody getBody() {
        return this.body;
    }

}
