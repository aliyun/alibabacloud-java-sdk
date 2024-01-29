// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecordLogsResponseBody body;

    public static DescribeRecordLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordLogsResponse self = new DescribeRecordLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecordLogsResponse setBody(DescribeRecordLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordLogsResponseBody getBody() {
        return this.body;
    }

}
