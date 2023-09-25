// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIAlarmRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDIAlarmRulesResponseBody body;

    public static ListDIAlarmRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDIAlarmRulesResponse self = new ListDIAlarmRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListDIAlarmRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDIAlarmRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDIAlarmRulesResponse setBody(ListDIAlarmRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDIAlarmRulesResponseBody getBody() {
        return this.body;
    }

}
