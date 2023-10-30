// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeImageModerationResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageModerationResultResponseBody body;

    public static DescribeImageModerationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageModerationResultResponse self = new DescribeImageModerationResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageModerationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageModerationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageModerationResultResponse setBody(DescribeImageModerationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageModerationResultResponseBody getBody() {
        return this.body;
    }

}
