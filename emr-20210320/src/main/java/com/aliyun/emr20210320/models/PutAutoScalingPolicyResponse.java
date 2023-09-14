// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PutAutoScalingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PutAutoScalingPolicyResponseBody body;

    public static PutAutoScalingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAutoScalingPolicyResponse self = new PutAutoScalingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public PutAutoScalingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAutoScalingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutAutoScalingPolicyResponse setBody(PutAutoScalingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAutoScalingPolicyResponseBody getBody() {
        return this.body;
    }

}
