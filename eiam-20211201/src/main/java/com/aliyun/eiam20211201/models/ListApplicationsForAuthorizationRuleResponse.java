// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsForAuthorizationRuleResponseBody body;

    public static ListApplicationsForAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForAuthorizationRuleResponse self = new ListApplicationsForAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsForAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsForAuthorizationRuleResponse setBody(ListApplicationsForAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsForAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
