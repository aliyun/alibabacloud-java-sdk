// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DescribeEapDeviceResourceAllocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEapDeviceResourceAllocationResponseBody body;

    public static DescribeEapDeviceResourceAllocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEapDeviceResourceAllocationResponse self = new DescribeEapDeviceResourceAllocationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEapDeviceResourceAllocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEapDeviceResourceAllocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEapDeviceResourceAllocationResponse setBody(DescribeEapDeviceResourceAllocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEapDeviceResourceAllocationResponseBody getBody() {
        return this.body;
    }

}
