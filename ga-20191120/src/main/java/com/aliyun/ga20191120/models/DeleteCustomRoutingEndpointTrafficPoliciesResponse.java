// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteCustomRoutingEndpointTrafficPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomRoutingEndpointTrafficPoliciesResponseBody body;

    public static DeleteCustomRoutingEndpointTrafficPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomRoutingEndpointTrafficPoliciesResponse self = new DeleteCustomRoutingEndpointTrafficPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomRoutingEndpointTrafficPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomRoutingEndpointTrafficPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomRoutingEndpointTrafficPoliciesResponse setBody(DeleteCustomRoutingEndpointTrafficPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomRoutingEndpointTrafficPoliciesResponseBody getBody() {
        return this.body;
    }

}
