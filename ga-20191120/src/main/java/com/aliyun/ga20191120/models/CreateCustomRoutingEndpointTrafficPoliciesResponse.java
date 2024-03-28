// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointTrafficPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomRoutingEndpointTrafficPoliciesResponseBody body;

    public static CreateCustomRoutingEndpointTrafficPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoutingEndpointTrafficPoliciesResponse self = new CreateCustomRoutingEndpointTrafficPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoutingEndpointTrafficPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomRoutingEndpointTrafficPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomRoutingEndpointTrafficPoliciesResponse setBody(CreateCustomRoutingEndpointTrafficPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomRoutingEndpointTrafficPoliciesResponseBody getBody() {
        return this.body;
    }

}
