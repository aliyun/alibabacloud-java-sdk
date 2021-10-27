// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataImportTaskReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataImportTaskReportResponseBody body;

    public static DescribeDataImportTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataImportTaskReportResponse self = new DescribeDataImportTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataImportTaskReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataImportTaskReportResponse setBody(DescribeDataImportTaskReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataImportTaskReportResponseBody getBody() {
        return this.body;
    }

}
