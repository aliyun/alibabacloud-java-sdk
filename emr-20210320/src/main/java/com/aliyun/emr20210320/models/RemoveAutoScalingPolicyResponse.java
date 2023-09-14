// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RemoveAutoScalingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAutoScalingPolicyResponseBody body;

    public static RemoveAutoScalingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAutoScalingPolicyResponse self = new RemoveAutoScalingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAutoScalingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAutoScalingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAutoScalingPolicyResponse setBody(RemoveAutoScalingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAutoScalingPolicyResponseBody getBody() {
        return this.body;
    }

}
