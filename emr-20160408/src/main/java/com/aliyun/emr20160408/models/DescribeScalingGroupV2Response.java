// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingGroupV2ResponseBody body;

    public static DescribeScalingGroupV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupV2Response self = new DescribeScalingGroupV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingGroupV2Response setBody(DescribeScalingGroupV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingGroupV2ResponseBody getBody() {
        return this.body;
    }

}
