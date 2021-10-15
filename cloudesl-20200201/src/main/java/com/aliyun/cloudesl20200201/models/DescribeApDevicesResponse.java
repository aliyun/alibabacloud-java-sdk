// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeApDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApDevicesResponseBody body;

    public static DescribeApDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApDevicesResponse self = new DescribeApDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApDevicesResponse setBody(DescribeApDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApDevicesResponseBody getBody() {
        return this.body;
    }

}
