// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingConfigurationsResponseBody body;

    public static DescribeScalingConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigurationsResponse self = new DescribeScalingConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingConfigurationsResponse setBody(DescribeScalingConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingConfigurationsResponseBody getBody() {
        return this.body;
    }

}
