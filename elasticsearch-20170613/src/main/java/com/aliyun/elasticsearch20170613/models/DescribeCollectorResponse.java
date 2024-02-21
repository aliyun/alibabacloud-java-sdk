// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeCollectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCollectorResponseBody body;

    public static DescribeCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCollectorResponse self = new DescribeCollectorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCollectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCollectorResponse setBody(DescribeCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCollectorResponseBody getBody() {
        return this.body;
    }

}
