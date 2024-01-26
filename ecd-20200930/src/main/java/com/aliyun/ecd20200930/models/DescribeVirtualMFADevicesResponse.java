// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVirtualMFADevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVirtualMFADevicesResponseBody body;

    public static DescribeVirtualMFADevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualMFADevicesResponse self = new DescribeVirtualMFADevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualMFADevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualMFADevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVirtualMFADevicesResponse setBody(DescribeVirtualMFADevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualMFADevicesResponseBody getBody() {
        return this.body;
    }

}
