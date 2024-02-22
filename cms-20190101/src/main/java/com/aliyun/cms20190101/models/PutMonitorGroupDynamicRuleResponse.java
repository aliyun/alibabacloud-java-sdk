// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitorGroupDynamicRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutMonitorGroupDynamicRuleResponseBody body;

    public static PutMonitorGroupDynamicRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutMonitorGroupDynamicRuleResponse self = new PutMonitorGroupDynamicRuleResponse();
        return TeaModel.build(map, self);
    }

    public PutMonitorGroupDynamicRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutMonitorGroupDynamicRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutMonitorGroupDynamicRuleResponse setBody(PutMonitorGroupDynamicRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutMonitorGroupDynamicRuleResponseBody getBody() {
        return this.body;
    }

}
