// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListBatchExportTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBatchExportTasksResponseBody body;

    public static ListBatchExportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBatchExportTasksResponse self = new ListBatchExportTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListBatchExportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBatchExportTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBatchExportTasksResponse setBody(ListBatchExportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBatchExportTasksResponseBody getBody() {
        return this.body;
    }

}
