// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class EnableSceneRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSceneRuleResponseBody body;

    public static EnableSceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneRuleResponse self = new EnableSceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableSceneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSceneRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSceneRuleResponse setBody(EnableSceneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSceneRuleResponseBody getBody() {
        return this.body;
    }

}
