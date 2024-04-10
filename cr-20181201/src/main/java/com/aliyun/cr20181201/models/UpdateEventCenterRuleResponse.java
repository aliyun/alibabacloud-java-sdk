// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateEventCenterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEventCenterRuleResponseBody body;

    public static UpdateEventCenterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventCenterRuleResponse self = new UpdateEventCenterRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventCenterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventCenterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEventCenterRuleResponse setBody(UpdateEventCenterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventCenterRuleResponseBody getBody() {
        return this.body;
    }

}
