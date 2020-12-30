// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingActivityResponseBody body;

    public static DescribeScalingActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivityResponse self = new DescribeScalingActivityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingActivityResponse setBody(DescribeScalingActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingActivityResponseBody getBody() {
        return this.body;
    }

}
