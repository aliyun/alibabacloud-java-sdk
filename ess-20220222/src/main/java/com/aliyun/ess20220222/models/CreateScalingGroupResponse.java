// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScalingGroupResponseBody body;

    public static CreateScalingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingGroupResponse self = new CreateScalingGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateScalingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScalingGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScalingGroupResponse setBody(CreateScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScalingGroupResponseBody getBody() {
        return this.body;
    }

}
