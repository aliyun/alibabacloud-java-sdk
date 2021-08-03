// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVirtualMFADevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVirtualMFADevicesResponse setBody(DescribeVirtualMFADevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualMFADevicesResponseBody getBody() {
        return this.body;
    }

}
