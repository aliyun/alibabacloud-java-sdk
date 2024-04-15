// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecordingsResponseBody body;

    public static DescribeRecordingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordingsResponse self = new DescribeRecordingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecordingsResponse setBody(DescribeRecordingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordingsResponseBody getBody() {
        return this.body;
    }

}
