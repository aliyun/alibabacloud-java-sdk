// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateArchiveFileInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateArchiveFileInspectionTaskResponseBody body;

    public static CreateArchiveFileInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateArchiveFileInspectionTaskResponse self = new CreateArchiveFileInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateArchiveFileInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateArchiveFileInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateArchiveFileInspectionTaskResponse setBody(CreateArchiveFileInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateArchiveFileInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
