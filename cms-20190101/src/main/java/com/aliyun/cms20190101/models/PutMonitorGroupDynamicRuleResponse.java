// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitorGroupDynamicRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PutMonitorGroupDynamicRuleResponse setBody(PutMonitorGroupDynamicRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutMonitorGroupDynamicRuleResponseBody getBody() {
        return this.body;
    }

}
