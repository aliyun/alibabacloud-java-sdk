// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceAutoScalerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceAutoScalerResponseBody body;

    public static DescribeServiceAutoScalerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAutoScalerResponse self = new DescribeServiceAutoScalerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAutoScalerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceAutoScalerResponse setBody(DescribeServiceAutoScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceAutoScalerResponseBody getBody() {
        return this.body;
    }

}
