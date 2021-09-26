// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateScalingGroupResponse setBody(CreateScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScalingGroupResponseBody getBody() {
        return this.body;
    }

}
