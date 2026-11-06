// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeExportTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExportTasksResponseBody body;

    public static DescribeExportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportTasksResponse self = new DescribeExportTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExportTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExportTasksResponse setBody(DescribeExportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExportTasksResponseBody getBody() {
        return this.body;
    }

}
