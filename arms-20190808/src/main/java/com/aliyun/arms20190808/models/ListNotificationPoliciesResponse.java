// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListNotificationPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNotificationPoliciesResponseBody body;

    public static ListNotificationPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationPoliciesResponse self = new ListNotificationPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListNotificationPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNotificationPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNotificationPoliciesResponse setBody(ListNotificationPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNotificationPoliciesResponseBody getBody() {
        return this.body;
    }

}
