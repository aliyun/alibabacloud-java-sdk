// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreatePolicyBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePolicyBindingsResponseBody body;

    public static CreatePolicyBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyBindingsResponse self = new CreatePolicyBindingsResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolicyBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolicyBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolicyBindingsResponse setBody(CreatePolicyBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolicyBindingsResponseBody getBody() {
        return this.body;
    }

}
