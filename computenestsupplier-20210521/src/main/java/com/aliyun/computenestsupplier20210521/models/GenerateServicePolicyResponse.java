// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GenerateServicePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateServicePolicyResponseBody body;

    public static GenerateServicePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateServicePolicyResponse self = new GenerateServicePolicyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateServicePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateServicePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateServicePolicyResponse setBody(GenerateServicePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateServicePolicyResponseBody getBody() {
        return this.body;
    }

}
