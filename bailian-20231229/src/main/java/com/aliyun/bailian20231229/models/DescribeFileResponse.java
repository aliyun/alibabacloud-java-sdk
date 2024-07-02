// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DescribeFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFileResponseBody body;

    public static DescribeFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileResponse self = new DescribeFileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileResponse setBody(DescribeFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileResponseBody getBody() {
        return this.body;
    }

}
