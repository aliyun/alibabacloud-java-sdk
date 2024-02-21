// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateJobMonitorRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateJobMonitorRuleResponseBody body;

    public static CreateJobMonitorRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJobMonitorRuleResponse self = new CreateJobMonitorRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateJobMonitorRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJobMonitorRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJobMonitorRuleResponse setBody(CreateJobMonitorRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJobMonitorRuleResponseBody getBody() {
        return this.body;
    }

}
