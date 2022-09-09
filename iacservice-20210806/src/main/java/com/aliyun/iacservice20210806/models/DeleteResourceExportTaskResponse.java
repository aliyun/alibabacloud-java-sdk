// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteResourceExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceExportTaskResponseBody body;

    public static DeleteResourceExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceExportTaskResponse self = new DeleteResourceExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceExportTaskResponse setBody(DeleteResourceExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceExportTaskResponseBody getBody() {
        return this.body;
    }

}
