// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PutManagedScalingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutManagedScalingPolicyResponseBody body;

    public static PutManagedScalingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        PutManagedScalingPolicyResponse self = new PutManagedScalingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public PutManagedScalingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutManagedScalingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutManagedScalingPolicyResponse setBody(PutManagedScalingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public PutManagedScalingPolicyResponseBody getBody() {
        return this.body;
    }

}
