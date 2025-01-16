// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitProjectExportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitProjectExportJobResponseBody body;

    public static SubmitProjectExportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitProjectExportJobResponse self = new SubmitProjectExportJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitProjectExportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitProjectExportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitProjectExportJobResponse setBody(SubmitProjectExportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitProjectExportJobResponseBody getBody() {
        return this.body;
    }

}
