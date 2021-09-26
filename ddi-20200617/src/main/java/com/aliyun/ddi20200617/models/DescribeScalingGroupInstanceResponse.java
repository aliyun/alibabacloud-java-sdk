// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingGroupInstanceResponseBody body;

    public static DescribeScalingGroupInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupInstanceResponse self = new DescribeScalingGroupInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingGroupInstanceResponse setBody(DescribeScalingGroupInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingGroupInstanceResponseBody getBody() {
        return this.body;
    }

}
