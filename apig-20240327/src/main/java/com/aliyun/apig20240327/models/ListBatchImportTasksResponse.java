// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListBatchImportTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBatchImportTasksResponseBody body;

    public static ListBatchImportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBatchImportTasksResponse self = new ListBatchImportTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListBatchImportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBatchImportTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBatchImportTasksResponse setBody(ListBatchImportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBatchImportTasksResponseBody getBody() {
        return this.body;
    }

}
