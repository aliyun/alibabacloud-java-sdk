// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteSchedulerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSchedulerRuleResponseBody body;

    public static DeleteSchedulerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedulerRuleResponse self = new DeleteSchedulerRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchedulerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSchedulerRuleResponse setBody(DeleteSchedulerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchedulerRuleResponseBody getBody() {
        return this.body;
    }

}
