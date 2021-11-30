// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAcceleratorAutoRenewAttributeResponseBody body;

    public static DescribeAcceleratorAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcceleratorAutoRenewAttributeResponse self = new DescribeAcceleratorAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAcceleratorAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAcceleratorAutoRenewAttributeResponse setBody(DescribeAcceleratorAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAcceleratorAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
