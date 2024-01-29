// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class EnableScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableScalingGroupResponseBody body;

    public static EnableScalingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableScalingGroupResponse self = new EnableScalingGroupResponse();
        return TeaModel.build(map, self);
    }

    public EnableScalingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableScalingGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableScalingGroupResponse setBody(EnableScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableScalingGroupResponseBody getBody() {
        return this.body;
    }

}
