// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScalingGroupResponseBody body;

    public static ListScalingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScalingGroupResponse self = new ListScalingGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListScalingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScalingGroupResponse setBody(ListScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScalingGroupResponseBody getBody() {
        return this.body;
    }

}
