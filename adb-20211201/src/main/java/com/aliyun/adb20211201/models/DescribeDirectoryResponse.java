// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDirectoryResponseBody body;

    public static DescribeDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoryResponse self = new DescribeDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDirectoryResponse setBody(DescribeDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDirectoryResponseBody getBody() {
        return this.body;
    }

}
