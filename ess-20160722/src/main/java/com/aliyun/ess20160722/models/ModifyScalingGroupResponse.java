// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class ModifyScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyScalingGroupResponseBody body;

    public static ModifyScalingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingGroupResponse self = new ModifyScalingGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScalingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScalingGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyScalingGroupResponse setBody(ModifyScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScalingGroupResponseBody getBody() {
        return this.body;
    }

}
