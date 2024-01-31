// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeFileModerationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFileModerationResultResponseBody body;

    public static DescribeFileModerationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileModerationResultResponse self = new DescribeFileModerationResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileModerationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileModerationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileModerationResultResponse setBody(DescribeFileModerationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileModerationResultResponseBody getBody() {
        return this.body;
    }

}
