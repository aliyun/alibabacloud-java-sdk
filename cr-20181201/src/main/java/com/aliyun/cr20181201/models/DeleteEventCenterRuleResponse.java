// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteEventCenterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEventCenterRuleResponseBody body;

    public static DeleteEventCenterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventCenterRuleResponse self = new DeleteEventCenterRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventCenterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventCenterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventCenterRuleResponse setBody(DeleteEventCenterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventCenterRuleResponseBody getBody() {
        return this.body;
    }

}
