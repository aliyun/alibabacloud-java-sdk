// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceOnlineInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceOnlineInfoResponseBody body;

    public static DescribeDeviceOnlineInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceOnlineInfoResponse self = new DescribeDeviceOnlineInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceOnlineInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceOnlineInfoResponse setBody(DescribeDeviceOnlineInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceOnlineInfoResponseBody getBody() {
        return this.body;
    }

}
