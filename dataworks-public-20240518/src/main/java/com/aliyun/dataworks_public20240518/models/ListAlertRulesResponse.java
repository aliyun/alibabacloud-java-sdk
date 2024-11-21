// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertRulesResponseBody body;

    public static ListAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertRulesResponse self = new ListAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertRulesResponse setBody(ListAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertRulesResponseBody getBody() {
        return this.body;
    }

}
