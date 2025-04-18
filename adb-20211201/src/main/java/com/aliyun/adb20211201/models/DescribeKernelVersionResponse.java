// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeKernelVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKernelVersionResponseBody body;

    public static DescribeKernelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKernelVersionResponse self = new DescribeKernelVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKernelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKernelVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKernelVersionResponse setBody(DescribeKernelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKernelVersionResponseBody getBody() {
        return this.body;
    }

}
