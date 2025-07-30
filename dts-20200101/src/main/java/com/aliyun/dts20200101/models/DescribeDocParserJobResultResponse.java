// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDocParserJobResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDocParserJobResultResponseBody body;

    public static DescribeDocParserJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocParserJobResultResponse self = new DescribeDocParserJobResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDocParserJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDocParserJobResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDocParserJobResultResponse setBody(DescribeDocParserJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDocParserJobResultResponseBody getBody() {
        return this.body;
    }

}
