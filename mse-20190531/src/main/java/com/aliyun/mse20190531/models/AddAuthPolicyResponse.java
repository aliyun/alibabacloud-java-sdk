// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddAuthPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAuthPolicyResponseBody body;

    public static AddAuthPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAuthPolicyResponse self = new AddAuthPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AddAuthPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAuthPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAuthPolicyResponse setBody(AddAuthPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAuthPolicyResponseBody getBody() {
        return this.body;
    }

}
