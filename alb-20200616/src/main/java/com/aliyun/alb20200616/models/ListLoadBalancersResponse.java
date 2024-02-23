// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListLoadBalancersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLoadBalancersResponseBody body;

    public static ListLoadBalancersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancersResponse self = new ListLoadBalancersResponse();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLoadBalancersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLoadBalancersResponse setBody(ListLoadBalancersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLoadBalancersResponseBody getBody() {
        return this.body;
    }

}
