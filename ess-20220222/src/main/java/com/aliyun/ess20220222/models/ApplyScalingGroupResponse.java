// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ApplyScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyScalingGroupResponseBody body;

    public static ApplyScalingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyScalingGroupResponse self = new ApplyScalingGroupResponse();
        return TeaModel.build(map, self);
    }

    public ApplyScalingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyScalingGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyScalingGroupResponse setBody(ApplyScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyScalingGroupResponseBody getBody() {
        return this.body;
    }

}
