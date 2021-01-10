// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceIdByOuterInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceIdByOuterInfoResponseBody body;

    public static DescribeDeviceIdByOuterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceIdByOuterInfoResponse self = new DescribeDeviceIdByOuterInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceIdByOuterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceIdByOuterInfoResponse setBody(DescribeDeviceIdByOuterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceIdByOuterInfoResponseBody getBody() {
        return this.body;
    }

}
