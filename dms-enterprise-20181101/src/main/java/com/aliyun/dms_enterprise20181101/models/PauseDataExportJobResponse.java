// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PauseDataExportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseDataExportJobResponseBody body;

    public static PauseDataExportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseDataExportJobResponse self = new PauseDataExportJobResponse();
        return TeaModel.build(map, self);
    }

    public PauseDataExportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseDataExportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseDataExportJobResponse setBody(PauseDataExportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseDataExportJobResponseBody getBody() {
        return this.body;
    }

}
