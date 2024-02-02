// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceAutoRenewAttributeResponseBody body;

    public static DescribeInstanceAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewAttributeResponse self = new DescribeInstanceAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAutoRenewAttributeResponse setBody(DescribeInstanceAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
