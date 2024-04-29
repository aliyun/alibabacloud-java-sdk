// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class SwitchSchedulerRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchSchedulerRuleResponseBody body;

    public static SwitchSchedulerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchSchedulerRuleResponse self = new SwitchSchedulerRuleResponse();
        return TeaModel.build(map, self);
    }

    public SwitchSchedulerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchSchedulerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchSchedulerRuleResponse setBody(SwitchSchedulerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchSchedulerRuleResponseBody getBody() {
        return this.body;
    }

}
