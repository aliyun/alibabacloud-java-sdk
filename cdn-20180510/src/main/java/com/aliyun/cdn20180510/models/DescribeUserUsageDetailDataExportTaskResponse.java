// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserUsageDetailDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserUsageDetailDataExportTaskResponseBody body;

    public static DescribeUserUsageDetailDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserUsageDetailDataExportTaskResponse self = new DescribeUserUsageDetailDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserUsageDetailDataExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserUsageDetailDataExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserUsageDetailDataExportTaskResponse setBody(DescribeUserUsageDetailDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserUsageDetailDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
