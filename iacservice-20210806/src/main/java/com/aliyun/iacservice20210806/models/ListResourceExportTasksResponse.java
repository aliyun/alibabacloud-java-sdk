// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceExportTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceExportTasksResponseBody body;

    public static ListResourceExportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExportTasksResponse self = new ListResourceExportTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceExportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceExportTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceExportTasksResponse setBody(ListResourceExportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceExportTasksResponseBody getBody() {
        return this.body;
    }

}
