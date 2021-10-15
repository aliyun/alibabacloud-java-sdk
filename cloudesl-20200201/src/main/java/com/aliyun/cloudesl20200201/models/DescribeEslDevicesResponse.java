// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeEslDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEslDevicesResponseBody body;

    public static DescribeEslDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEslDevicesResponse self = new DescribeEslDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEslDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEslDevicesResponse setBody(DescribeEslDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEslDevicesResponseBody getBody() {
        return this.body;
    }

}
