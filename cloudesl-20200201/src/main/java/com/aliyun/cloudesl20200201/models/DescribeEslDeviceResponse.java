// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeEslDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEslDeviceResponseBody body;

    public static DescribeEslDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEslDeviceResponse self = new DescribeEslDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEslDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEslDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEslDeviceResponse setBody(DescribeEslDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEslDeviceResponseBody getBody() {
        return this.body;
    }

}
