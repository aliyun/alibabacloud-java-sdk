// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DetachFromPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachFromPolicyResponseBody body;

    public static DetachFromPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachFromPolicyResponse self = new DetachFromPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DetachFromPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachFromPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachFromPolicyResponse setBody(DetachFromPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachFromPolicyResponseBody getBody() {
        return this.body;
    }

}
