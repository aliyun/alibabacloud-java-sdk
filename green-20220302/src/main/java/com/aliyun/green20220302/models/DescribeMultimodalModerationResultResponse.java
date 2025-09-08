// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeMultimodalModerationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMultimodalModerationResultResponseBody body;

    public static DescribeMultimodalModerationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultimodalModerationResultResponse self = new DescribeMultimodalModerationResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMultimodalModerationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMultimodalModerationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMultimodalModerationResultResponse setBody(DescribeMultimodalModerationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMultimodalModerationResultResponseBody getBody() {
        return this.body;
    }

}
