// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveApiRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveApiRuleResponseBody body;

    public static RemoveApiRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveApiRuleResponse self = new RemoveApiRuleResponse();
        return TeaModel.build(map, self);
    }

    public RemoveApiRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveApiRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveApiRuleResponse setBody(RemoveApiRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveApiRuleResponseBody getBody() {
        return this.body;
    }

}
