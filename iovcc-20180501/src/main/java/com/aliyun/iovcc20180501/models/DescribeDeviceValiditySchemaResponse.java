// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceValiditySchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceValiditySchemaResponseBody body;

    public static DescribeDeviceValiditySchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceValiditySchemaResponse self = new DescribeDeviceValiditySchemaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceValiditySchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceValiditySchemaResponse setBody(DescribeDeviceValiditySchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceValiditySchemaResponseBody getBody() {
        return this.body;
    }

}
