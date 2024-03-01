// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddControlPolicyResponseBody body;

    public static AddControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddControlPolicyResponse self = new AddControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AddControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddControlPolicyResponse setBody(AddControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddControlPolicyResponseBody getBody() {
        return this.body;
    }

}
