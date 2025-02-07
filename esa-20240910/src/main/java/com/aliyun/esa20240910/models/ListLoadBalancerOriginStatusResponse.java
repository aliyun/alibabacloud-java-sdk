// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListLoadBalancerOriginStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLoadBalancerOriginStatusResponseBody body;

    public static ListLoadBalancerOriginStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancerOriginStatusResponse self = new ListLoadBalancerOriginStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancerOriginStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLoadBalancerOriginStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLoadBalancerOriginStatusResponse setBody(ListLoadBalancerOriginStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLoadBalancerOriginStatusResponseBody getBody() {
        return this.body;
    }

}
