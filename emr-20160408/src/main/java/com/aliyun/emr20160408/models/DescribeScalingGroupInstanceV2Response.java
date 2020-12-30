// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupInstanceV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingGroupInstanceV2ResponseBody body;

    public static DescribeScalingGroupInstanceV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupInstanceV2Response self = new DescribeScalingGroupInstanceV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupInstanceV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingGroupInstanceV2Response setBody(DescribeScalingGroupInstanceV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingGroupInstanceV2ResponseBody getBody() {
        return this.body;
    }

}
