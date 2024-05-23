// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DisableScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableScalingGroupResponseBody body;

    public static DisableScalingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableScalingGroupResponse self = new DisableScalingGroupResponse();
        return TeaModel.build(map, self);
    }

    public DisableScalingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableScalingGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableScalingGroupResponse setBody(DisableScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableScalingGroupResponseBody getBody() {
        return this.body;
    }

}
