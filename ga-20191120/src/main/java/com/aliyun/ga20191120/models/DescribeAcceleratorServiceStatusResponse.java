// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAcceleratorServiceStatusResponseBody body;

    public static DescribeAcceleratorServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcceleratorServiceStatusResponse self = new DescribeAcceleratorServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAcceleratorServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAcceleratorServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAcceleratorServiceStatusResponse setBody(DescribeAcceleratorServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAcceleratorServiceStatusResponseBody getBody() {
        return this.body;
    }

}
