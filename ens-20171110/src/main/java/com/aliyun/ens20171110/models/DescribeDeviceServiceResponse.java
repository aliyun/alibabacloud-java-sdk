// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDeviceServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceServiceResponseBody body;

    public static DescribeDeviceServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceServiceResponse self = new DescribeDeviceServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeviceServiceResponse setBody(DescribeDeviceServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceServiceResponseBody getBody() {
        return this.body;
    }

}
