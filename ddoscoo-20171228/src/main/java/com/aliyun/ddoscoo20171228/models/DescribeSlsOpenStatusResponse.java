// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlsOpenStatusResponseBody body;

    public static DescribeSlsOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsOpenStatusResponse self = new DescribeSlsOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlsOpenStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlsOpenStatusResponse setBody(DescribeSlsOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlsOpenStatusResponseBody getBody() {
        return this.body;
    }

}
