// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAutoRenewalAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoRenewalAttributeResponseBody body;

    public static DescribeAutoRenewalAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoRenewalAttributeResponse self = new DescribeAutoRenewalAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoRenewalAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoRenewalAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoRenewalAttributeResponse setBody(DescribeAutoRenewalAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoRenewalAttributeResponseBody getBody() {
        return this.body;
    }

}
