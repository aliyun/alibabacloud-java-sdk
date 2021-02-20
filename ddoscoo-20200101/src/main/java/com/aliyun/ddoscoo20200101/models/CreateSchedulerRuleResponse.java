// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateSchedulerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSchedulerRuleResponseBody body;

    public static CreateSchedulerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulerRuleResponse self = new CreateSchedulerRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateSchedulerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSchedulerRuleResponse setBody(CreateSchedulerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSchedulerRuleResponseBody getBody() {
        return this.body;
    }

}
