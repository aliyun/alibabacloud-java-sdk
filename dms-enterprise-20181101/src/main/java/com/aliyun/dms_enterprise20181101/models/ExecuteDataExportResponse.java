// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteDataExportResponseBody body;

    public static ExecuteDataExportResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataExportResponse self = new ExecuteDataExportResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteDataExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteDataExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteDataExportResponse setBody(ExecuteDataExportResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteDataExportResponseBody getBody() {
        return this.body;
    }

}
