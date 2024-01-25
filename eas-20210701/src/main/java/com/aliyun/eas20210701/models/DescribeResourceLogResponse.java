// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceLogResponseBody body;

    public static DescribeResourceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLogResponse self = new DescribeResourceLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceLogResponse setBody(DescribeResourceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceLogResponseBody getBody() {
        return this.body;
    }

}
