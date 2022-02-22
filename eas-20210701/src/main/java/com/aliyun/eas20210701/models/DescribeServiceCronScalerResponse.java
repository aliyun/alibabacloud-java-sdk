// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceCronScalerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceCronScalerResponseBody body;

    public static DescribeServiceCronScalerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceCronScalerResponse self = new DescribeServiceCronScalerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceCronScalerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceCronScalerResponse setBody(DescribeServiceCronScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceCronScalerResponseBody getBody() {
        return this.body;
    }

}
