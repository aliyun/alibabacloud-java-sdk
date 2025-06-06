// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteResourceExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteResourceExportTaskResponseBody body;

    public static ExecuteResourceExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteResourceExportTaskResponse self = new ExecuteResourceExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteResourceExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteResourceExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteResourceExportTaskResponse setBody(ExecuteResourceExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteResourceExportTaskResponseBody getBody() {
        return this.body;
    }

}
