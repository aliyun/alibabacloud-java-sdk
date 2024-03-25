// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTrafficMarkingPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrafficMarkingPoliciesResponseBody body;

    public static ListTrafficMarkingPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMarkingPoliciesResponse self = new ListTrafficMarkingPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListTrafficMarkingPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrafficMarkingPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrafficMarkingPoliciesResponse setBody(ListTrafficMarkingPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrafficMarkingPoliciesResponseBody getBody() {
        return this.body;
    }

}
