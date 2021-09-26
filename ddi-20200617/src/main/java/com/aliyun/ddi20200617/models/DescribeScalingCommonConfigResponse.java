// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingCommonConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingCommonConfigResponseBody body;

    public static DescribeScalingCommonConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingCommonConfigResponse self = new DescribeScalingCommonConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingCommonConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingCommonConfigResponse setBody(DescribeScalingCommonConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingCommonConfigResponseBody getBody() {
        return this.body;
    }

}
