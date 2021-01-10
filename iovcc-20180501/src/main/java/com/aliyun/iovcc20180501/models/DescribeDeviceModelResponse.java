// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceModelResponseBody body;

    public static DescribeDeviceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceModelResponse self = new DescribeDeviceModelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceModelResponse setBody(DescribeDeviceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceModelResponseBody getBody() {
        return this.body;
    }

}
