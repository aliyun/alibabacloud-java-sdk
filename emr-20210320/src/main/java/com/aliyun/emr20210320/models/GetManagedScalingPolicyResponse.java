// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetManagedScalingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetManagedScalingPolicyResponseBody body;

    public static GetManagedScalingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetManagedScalingPolicyResponse self = new GetManagedScalingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetManagedScalingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetManagedScalingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetManagedScalingPolicyResponse setBody(GetManagedScalingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetManagedScalingPolicyResponseBody getBody() {
        return this.body;
    }

}
