// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class SetCardStopRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCardStopRuleResponseBody body;

    public static SetCardStopRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCardStopRuleResponse self = new SetCardStopRuleResponse();
        return TeaModel.build(map, self);
    }

    public SetCardStopRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCardStopRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCardStopRuleResponse setBody(SetCardStopRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCardStopRuleResponseBody getBody() {
        return this.body;
    }

}
