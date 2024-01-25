// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetApiRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetApiRuleResponseBody body;

    public static SetApiRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApiRuleResponse self = new SetApiRuleResponse();
        return TeaModel.build(map, self);
    }

    public SetApiRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApiRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetApiRuleResponse setBody(SetApiRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApiRuleResponseBody getBody() {
        return this.body;
    }

}
