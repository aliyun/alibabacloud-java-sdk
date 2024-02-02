// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DisableSceneRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableSceneRuleResponseBody body;

    public static DisableSceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneRuleResponse self = new DisableSceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableSceneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSceneRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSceneRuleResponse setBody(DisableSceneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSceneRuleResponseBody getBody() {
        return this.body;
    }

}
