// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GenerateRamPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateRamPolicyResponseBody body;

    public static GenerateRamPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateRamPolicyResponse self = new GenerateRamPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateRamPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateRamPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateRamPolicyResponse setBody(GenerateRamPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateRamPolicyResponseBody getBody() {
        return this.body;
    }

}
