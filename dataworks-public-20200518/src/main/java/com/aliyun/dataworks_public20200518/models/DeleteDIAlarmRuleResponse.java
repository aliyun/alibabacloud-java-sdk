// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDIAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDIAlarmRuleResponseBody body;

    public static DeleteDIAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDIAlarmRuleResponse self = new DeleteDIAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDIAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDIAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDIAlarmRuleResponse setBody(DeleteDIAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDIAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
