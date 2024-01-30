// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewalAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceAutoRenewalAttributeResponseBody body;

    public static DescribeInstanceAutoRenewalAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewalAttributeResponse self = new DescribeInstanceAutoRenewalAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRenewalAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAutoRenewalAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAutoRenewalAttributeResponse setBody(DescribeInstanceAutoRenewalAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAutoRenewalAttributeResponseBody getBody() {
        return this.body;
    }

}
