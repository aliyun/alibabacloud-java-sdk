// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifySchedulerRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySchedulerRuleResponseBody body;

    public static ModifySchedulerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySchedulerRuleResponse self = new ModifySchedulerRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifySchedulerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySchedulerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySchedulerRuleResponse setBody(ModifySchedulerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySchedulerRuleResponseBody getBody() {
        return this.body;
    }

}
