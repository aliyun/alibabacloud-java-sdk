// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceListResponseBody body;

    public static DescribeDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceListResponse self = new DescribeDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceListResponse setBody(DescribeDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceListResponseBody getBody() {
        return this.body;
    }

}
