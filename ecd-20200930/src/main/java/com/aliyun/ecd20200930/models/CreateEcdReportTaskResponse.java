// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateEcdReportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEcdReportTaskResponseBody body;

    public static CreateEcdReportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEcdReportTaskResponse self = new CreateEcdReportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateEcdReportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEcdReportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEcdReportTaskResponse setBody(CreateEcdReportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEcdReportTaskResponseBody getBody() {
        return this.body;
    }

}
