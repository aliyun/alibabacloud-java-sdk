// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataExportTaskReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataExportTaskReportResponseBody body;

    public static DescribeDataExportTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataExportTaskReportResponse self = new DescribeDataExportTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataExportTaskReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataExportTaskReportResponse setBody(DescribeDataExportTaskReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataExportTaskReportResponseBody getBody() {
        return this.body;
    }

}
