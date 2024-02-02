// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstanceAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReservedInstanceAutoRenewAttributeResponseBody body;

    public static DescribeReservedInstanceAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstanceAutoRenewAttributeResponse self = new DescribeReservedInstanceAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstanceAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReservedInstanceAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReservedInstanceAutoRenewAttributeResponse setBody(DescribeReservedInstanceAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReservedInstanceAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
