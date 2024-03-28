// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointTrafficPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomRoutingEndpointTrafficPoliciesResponseBody body;

    public static ListCustomRoutingEndpointTrafficPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointTrafficPoliciesResponse self = new ListCustomRoutingEndpointTrafficPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponse setBody(ListCustomRoutingEndpointTrafficPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomRoutingEndpointTrafficPoliciesResponseBody getBody() {
        return this.body;
    }

}
