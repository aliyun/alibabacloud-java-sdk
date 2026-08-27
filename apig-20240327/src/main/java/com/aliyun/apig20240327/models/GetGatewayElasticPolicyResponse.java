// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayElasticPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayElasticPolicyResponseBody body;

    public static GetGatewayElasticPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayElasticPolicyResponse self = new GetGatewayElasticPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayElasticPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayElasticPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayElasticPolicyResponse setBody(GetGatewayElasticPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayElasticPolicyResponseBody getBody() {
        return this.body;
    }

}
