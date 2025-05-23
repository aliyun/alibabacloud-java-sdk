// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CancelResourceExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelResourceExportTaskResponseBody body;

    public static CancelResourceExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelResourceExportTaskResponse self = new CancelResourceExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelResourceExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelResourceExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelResourceExportTaskResponse setBody(CancelResourceExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelResourceExportTaskResponseBody getBody() {
        return this.body;
    }

}
