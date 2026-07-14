// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListNotifyPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNotifyPoliciesResponseBody body;

    public static ListNotifyPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotifyPoliciesResponse self = new ListNotifyPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListNotifyPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNotifyPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNotifyPoliciesResponse setBody(ListNotifyPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNotifyPoliciesResponseBody getBody() {
        return this.body;
    }

}
