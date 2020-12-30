// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceInfoResponseBody body;

    public static DescribeDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceInfoResponse self = new DescribeDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceInfoResponse setBody(DescribeDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
