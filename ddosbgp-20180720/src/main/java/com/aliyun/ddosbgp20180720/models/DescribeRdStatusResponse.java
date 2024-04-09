// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeRdStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRdStatusResponseBody body;

    public static DescribeRdStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdStatusResponse self = new DescribeRdStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdStatusResponse setBody(DescribeRdStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdStatusResponseBody getBody() {
        return this.body;
    }

}
