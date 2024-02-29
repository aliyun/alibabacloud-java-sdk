// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDIAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDIAlarmRuleResponseBody body;

    public static GetDIAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDIAlarmRuleResponse self = new GetDIAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetDIAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDIAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDIAlarmRuleResponse setBody(GetDIAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDIAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
