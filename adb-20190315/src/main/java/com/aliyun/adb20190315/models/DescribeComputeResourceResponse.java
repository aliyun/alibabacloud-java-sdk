// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeComputeResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComputeResourceResponseBody body;

    public static DescribeComputeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComputeResourceResponse self = new DescribeComputeResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComputeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComputeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComputeResourceResponse setBody(DescribeComputeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComputeResourceResponseBody getBody() {
        return this.body;
    }

}
