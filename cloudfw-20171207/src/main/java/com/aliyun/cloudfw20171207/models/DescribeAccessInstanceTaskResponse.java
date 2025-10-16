// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessInstanceTaskResponseBody body;

    public static DescribeAccessInstanceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceTaskResponse self = new DescribeAccessInstanceTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessInstanceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessInstanceTaskResponse setBody(DescribeAccessInstanceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessInstanceTaskResponseBody getBody() {
        return this.body;
    }

}
