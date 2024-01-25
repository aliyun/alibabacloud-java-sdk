// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceResponseBody body;

    public static DescribeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceResponse self = new DescribeResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceResponse setBody(DescribeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceResponseBody getBody() {
        return this.body;
    }

}
