// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListQosPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQosPoliciesResponseBody body;

    public static ListQosPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQosPoliciesResponse self = new ListQosPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListQosPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQosPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQosPoliciesResponse setBody(ListQosPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQosPoliciesResponseBody getBody() {
        return this.body;
    }

}
