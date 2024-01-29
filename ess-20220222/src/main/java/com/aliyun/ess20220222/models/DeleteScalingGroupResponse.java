// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteScalingGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScalingGroupResponse setBody(DeleteScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScalingGroupResponseBody getBody() {
        return this.body;
    }

}
