// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SubmitResultExportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitResultExportJobResponseBody body;

    public static SubmitResultExportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitResultExportJobResponse self = new SubmitResultExportJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitResultExportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitResultExportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitResultExportJobResponse setBody(SubmitResultExportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitResultExportJobResponseBody getBody() {
        return this.body;
    }

}
