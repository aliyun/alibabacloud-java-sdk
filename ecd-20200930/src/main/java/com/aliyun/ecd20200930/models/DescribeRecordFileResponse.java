// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecordFileResponseBody body;

    public static DescribeRecordFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordFileResponse self = new DescribeRecordFileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecordFileResponse setBody(DescribeRecordFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordFileResponseBody getBody() {
        return this.body;
    }

}
