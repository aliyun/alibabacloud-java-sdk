// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRuleNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventCenterRuleNameResponseBody body;

    public static ListEventCenterRuleNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventCenterRuleNameResponse self = new ListEventCenterRuleNameResponse();
        return TeaModel.build(map, self);
    }

    public ListEventCenterRuleNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventCenterRuleNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventCenterRuleNameResponse setBody(ListEventCenterRuleNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventCenterRuleNameResponseBody getBody() {
        return this.body;
    }

}
