// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupDynamicRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMonitorGroupDynamicRuleResponseBody body;

    public static DeleteMonitorGroupDynamicRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupDynamicRuleResponse self = new DeleteMonitorGroupDynamicRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupDynamicRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMonitorGroupDynamicRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMonitorGroupDynamicRuleResponse setBody(DeleteMonitorGroupDynamicRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMonitorGroupDynamicRuleResponseBody getBody() {
        return this.body;
    }

}
