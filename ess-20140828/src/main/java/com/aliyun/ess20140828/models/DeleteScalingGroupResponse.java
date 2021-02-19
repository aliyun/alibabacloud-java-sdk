// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DeleteScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScalingGroupResponseBody body;

    public static DeleteScalingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingGroupResponse self = new DeleteScalingGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScalingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScalingGroupResponse setBody(DeleteScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScalingGroupResponseBody getBody() {
        return this.body;
    }

}
