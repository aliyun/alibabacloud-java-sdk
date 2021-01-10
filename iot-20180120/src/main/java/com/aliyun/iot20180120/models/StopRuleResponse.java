// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StopRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopRuleResponseBody body;

    public static StopRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRuleResponse self = new StopRuleResponse();
        return TeaModel.build(map, self);
    }

    public StopRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRuleResponse setBody(StopRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRuleResponseBody getBody() {
        return this.body;
    }

}
