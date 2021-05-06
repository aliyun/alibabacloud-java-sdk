// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutoRenewAttributeResponseBody body;

    public static DescribeAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoRenewAttributeResponse self = new DescribeAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoRenewAttributeResponse setBody(DescribeAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
