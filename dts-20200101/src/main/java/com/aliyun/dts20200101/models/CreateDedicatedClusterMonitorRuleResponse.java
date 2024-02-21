// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDedicatedClusterMonitorRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDedicatedClusterMonitorRuleResponseBody body;

    public static CreateDedicatedClusterMonitorRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedClusterMonitorRuleResponse self = new CreateDedicatedClusterMonitorRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedClusterMonitorRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDedicatedClusterMonitorRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDedicatedClusterMonitorRuleResponse setBody(CreateDedicatedClusterMonitorRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDedicatedClusterMonitorRuleResponseBody getBody() {
        return this.body;
    }

}
