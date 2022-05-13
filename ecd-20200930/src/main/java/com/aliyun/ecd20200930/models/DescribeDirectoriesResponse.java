// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDirectoriesResponseBody body;

    public static DescribeDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoriesResponse self = new DescribeDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDirectoriesResponse setBody(DescribeDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDirectoriesResponseBody getBody() {
        return this.body;
    }

}
