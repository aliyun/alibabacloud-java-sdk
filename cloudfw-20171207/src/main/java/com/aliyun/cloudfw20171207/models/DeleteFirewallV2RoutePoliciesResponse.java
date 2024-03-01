// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteFirewallV2RoutePoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFirewallV2RoutePoliciesResponseBody body;

    public static DeleteFirewallV2RoutePoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFirewallV2RoutePoliciesResponse self = new DeleteFirewallV2RoutePoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFirewallV2RoutePoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFirewallV2RoutePoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFirewallV2RoutePoliciesResponse setBody(DeleteFirewallV2RoutePoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFirewallV2RoutePoliciesResponseBody getBody() {
        return this.body;
    }

}
