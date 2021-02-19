// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DisableScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableScalingGroupResponse setBody(DisableScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableScalingGroupResponseBody getBody() {
        return this.body;
    }

}
