// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyScalingGroupResponse setBody(ModifyScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScalingGroupResponseBody getBody() {
        return this.body;
    }

}
