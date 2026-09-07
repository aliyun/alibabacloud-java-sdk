// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePeripheralDriversResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePeripheralDriversResponseBody body;

    public static DescribePeripheralDriversResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePeripheralDriversResponse self = new DescribePeripheralDriversResponse();
        return TeaModel.build(map, self);
    }

    public DescribePeripheralDriversResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePeripheralDriversResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePeripheralDriversResponse setBody(DescribePeripheralDriversResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePeripheralDriversResponseBody getBody() {
        return this.body;
    }

}
