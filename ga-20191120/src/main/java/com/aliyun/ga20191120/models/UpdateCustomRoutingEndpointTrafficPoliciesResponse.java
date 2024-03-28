// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointTrafficPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomRoutingEndpointTrafficPoliciesResponseBody body;

    public static UpdateCustomRoutingEndpointTrafficPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointTrafficPoliciesResponse self = new UpdateCustomRoutingEndpointTrafficPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointTrafficPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomRoutingEndpointTrafficPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomRoutingEndpointTrafficPoliciesResponse setBody(UpdateCustomRoutingEndpointTrafficPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomRoutingEndpointTrafficPoliciesResponseBody getBody() {
        return this.body;
    }

}
