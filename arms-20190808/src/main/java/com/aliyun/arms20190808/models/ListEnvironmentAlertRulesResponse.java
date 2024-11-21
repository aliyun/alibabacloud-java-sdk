// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvironmentAlertRulesResponseBody body;

    public static ListEnvironmentAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentAlertRulesResponse self = new ListEnvironmentAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvironmentAlertRulesResponse setBody(ListEnvironmentAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentAlertRulesResponseBody getBody() {
        return this.body;
    }

}
