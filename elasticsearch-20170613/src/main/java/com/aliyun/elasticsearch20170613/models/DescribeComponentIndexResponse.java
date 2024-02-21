// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeComponentIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComponentIndexResponseBody body;

    public static DescribeComponentIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentIndexResponse self = new DescribeComponentIndexResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComponentIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComponentIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComponentIndexResponse setBody(DescribeComponentIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComponentIndexResponseBody getBody() {
        return this.body;
    }

}
