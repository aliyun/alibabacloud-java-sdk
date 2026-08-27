// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGlobalPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGlobalPoliciesResponseBody body;

    public static ListGlobalPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalPoliciesResponse self = new ListGlobalPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListGlobalPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGlobalPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGlobalPoliciesResponse setBody(ListGlobalPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGlobalPoliciesResponseBody getBody() {
        return this.body;
    }

}
