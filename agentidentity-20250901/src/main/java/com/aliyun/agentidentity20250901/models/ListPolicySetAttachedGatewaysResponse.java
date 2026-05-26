// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListPolicySetAttachedGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPolicySetAttachedGatewaysResponseBody body;

    public static ListPolicySetAttachedGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicySetAttachedGatewaysResponse self = new ListPolicySetAttachedGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicySetAttachedGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolicySetAttachedGatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPolicySetAttachedGatewaysResponse setBody(ListPolicySetAttachedGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolicySetAttachedGatewaysResponseBody getBody() {
        return this.body;
    }

}
