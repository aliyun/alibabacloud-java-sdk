// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExportTaskResponseBody body;

    public static CreateExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExportTaskResponse self = new CreateExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExportTaskResponse setBody(CreateExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExportTaskResponseBody getBody() {
        return this.body;
    }

}
