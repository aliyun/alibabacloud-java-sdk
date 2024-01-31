// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeUrlModerationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUrlModerationResultResponseBody body;

    public static DescribeUrlModerationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUrlModerationResultResponse self = new DescribeUrlModerationResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUrlModerationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUrlModerationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUrlModerationResultResponse setBody(DescribeUrlModerationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUrlModerationResultResponseBody getBody() {
        return this.body;
    }

}
