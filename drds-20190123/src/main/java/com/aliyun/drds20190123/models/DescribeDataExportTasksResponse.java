// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataExportTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataExportTasksResponseBody body;

    public static DescribeDataExportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataExportTasksResponse self = new DescribeDataExportTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataExportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataExportTasksResponse setBody(DescribeDataExportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataExportTasksResponseBody getBody() {
        return this.body;
    }

}
