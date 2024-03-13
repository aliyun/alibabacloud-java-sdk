// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceBillResponseBody body;

    public static DescribeInstanceBillResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceBillResponse self = new DescribeInstanceBillResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceBillResponse setBody(DescribeInstanceBillResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceBillResponseBody getBody() {
        return this.body;
    }

}
