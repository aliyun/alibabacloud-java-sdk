// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUserUsageDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserUsageDataExportTaskResponseBody body;

    public static CreateUserUsageDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserUsageDataExportTaskResponse self = new CreateUserUsageDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserUsageDataExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserUsageDataExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserUsageDataExportTaskResponse setBody(CreateUserUsageDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserUsageDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
