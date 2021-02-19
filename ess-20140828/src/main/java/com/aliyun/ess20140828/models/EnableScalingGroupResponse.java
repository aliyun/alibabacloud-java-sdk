// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class EnableScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EnableScalingGroupResponse setBody(EnableScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableScalingGroupResponseBody getBody() {
        return this.body;
    }

}
