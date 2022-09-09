// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateResourceExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourceExportTaskResponseBody body;

    public static CreateResourceExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceExportTaskResponse self = new CreateResourceExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceExportTaskResponse setBody(CreateResourceExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceExportTaskResponseBody getBody() {
        return this.body;
    }

}
