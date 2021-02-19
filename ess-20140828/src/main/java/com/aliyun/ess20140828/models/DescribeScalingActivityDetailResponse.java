// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingActivityDetailResponseBody body;

    public static DescribeScalingActivityDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivityDetailResponse self = new DescribeScalingActivityDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivityDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingActivityDetailResponse setBody(DescribeScalingActivityDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingActivityDetailResponseBody getBody() {
        return this.body;
    }

}
