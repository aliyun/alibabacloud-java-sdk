// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeApmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApmResponseBody body;

    public static DescribeApmResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApmResponse self = new DescribeApmResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApmResponse setBody(DescribeApmResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApmResponseBody getBody() {
        return this.body;
    }

}
