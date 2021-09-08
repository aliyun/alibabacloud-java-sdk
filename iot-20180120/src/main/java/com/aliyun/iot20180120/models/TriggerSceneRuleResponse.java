// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TriggerSceneRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public TriggerSceneRuleResponse setBody(TriggerSceneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerSceneRuleResponseBody getBody() {
        return this.body;
    }

}
