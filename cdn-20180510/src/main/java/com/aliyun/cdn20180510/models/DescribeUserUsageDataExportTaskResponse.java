// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserUsageDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserUsageDataExportTaskResponseBody body;

    public static DescribeUserUsageDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserUsageDataExportTaskResponse self = new DescribeUserUsageDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserUsageDataExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserUsageDataExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserUsageDataExportTaskResponse setBody(DescribeUserUsageDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserUsageDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
