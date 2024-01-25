// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClientsResponseBody body;

    public static DescribeClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientsResponse self = new DescribeClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClientsResponse setBody(DescribeClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientsResponseBody getBody() {
        return this.body;
    }

}
