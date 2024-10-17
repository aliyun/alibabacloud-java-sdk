// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SuspendDataExportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendDataExportJobResponseBody body;

    public static SuspendDataExportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendDataExportJobResponse self = new SuspendDataExportJobResponse();
        return TeaModel.build(map, self);
    }

    public SuspendDataExportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendDataExportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendDataExportJobResponse setBody(SuspendDataExportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendDataExportJobResponseBody getBody() {
        return this.body;
    }

}
