// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteSchedulerRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteSchedulerRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSchedulerRuleResponse setBody(DeleteSchedulerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchedulerRuleResponseBody getBody() {
        return this.body;
    }

}
