// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListExportTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExportTasksResponseBody body;

    public static ListExportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExportTasksResponse self = new ListExportTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListExportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExportTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExportTasksResponse setBody(ListExportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExportTasksResponseBody getBody() {
        return this.body;
    }

}
