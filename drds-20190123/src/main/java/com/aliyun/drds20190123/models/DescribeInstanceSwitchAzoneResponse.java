// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceSwitchAzoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceSwitchAzoneResponseBody body;

    public static DescribeInstanceSwitchAzoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSwitchAzoneResponse self = new DescribeInstanceSwitchAzoneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSwitchAzoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSwitchAzoneResponse setBody(DescribeInstanceSwitchAzoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSwitchAzoneResponseBody getBody() {
        return this.body;
    }

}
