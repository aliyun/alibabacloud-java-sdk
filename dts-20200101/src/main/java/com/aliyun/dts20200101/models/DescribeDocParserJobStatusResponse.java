// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDocParserJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDocParserJobStatusResponseBody body;

    public static DescribeDocParserJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocParserJobStatusResponse self = new DescribeDocParserJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDocParserJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDocParserJobStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDocParserJobStatusResponse setBody(DescribeDocParserJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDocParserJobStatusResponseBody getBody() {
        return this.body;
    }

}
