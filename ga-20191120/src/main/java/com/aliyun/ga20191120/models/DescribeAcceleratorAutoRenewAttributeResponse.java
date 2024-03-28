// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAcceleratorAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAcceleratorAutoRenewAttributeResponse setBody(DescribeAcceleratorAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAcceleratorAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
