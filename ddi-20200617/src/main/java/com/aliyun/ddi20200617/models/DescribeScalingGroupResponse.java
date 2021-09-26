// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingGroupResponseBody body;

    public static DescribeScalingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupResponse self = new DescribeScalingGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingGroupResponse setBody(DescribeScalingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingGroupResponseBody getBody() {
        return this.body;
    }

}
