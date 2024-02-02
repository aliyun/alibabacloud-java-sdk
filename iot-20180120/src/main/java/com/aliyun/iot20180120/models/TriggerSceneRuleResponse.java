// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TriggerSceneRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerSceneRuleResponseBody body;

    public static TriggerSceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerSceneRuleResponse self = new TriggerSceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public TriggerSceneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerSceneRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerSceneRuleResponse setBody(TriggerSceneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerSceneRuleResponseBody getBody() {
        return this.body;
    }

}
