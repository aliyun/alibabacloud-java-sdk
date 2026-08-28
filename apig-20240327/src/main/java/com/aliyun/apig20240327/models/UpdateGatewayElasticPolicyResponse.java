// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayElasticPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayElasticPolicyResponseBody body;

    public static UpdateGatewayElasticPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayElasticPolicyResponse self = new UpdateGatewayElasticPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayElasticPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayElasticPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayElasticPolicyResponse setBody(UpdateGatewayElasticPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayElasticPolicyResponseBody getBody() {
        return this.body;
    }

}
