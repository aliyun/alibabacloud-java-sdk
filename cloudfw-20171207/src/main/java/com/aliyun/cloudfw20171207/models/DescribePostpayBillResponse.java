// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePostpayBillResponseBody body;

    public static DescribePostpayBillResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayBillResponse self = new DescribePostpayBillResponse();
        return TeaModel.build(map, self);
    }

    public DescribePostpayBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePostpayBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePostpayBillResponse setBody(DescribePostpayBillResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePostpayBillResponseBody getBody() {
        return this.body;
    }

}
