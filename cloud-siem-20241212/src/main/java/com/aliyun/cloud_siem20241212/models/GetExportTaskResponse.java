// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExportTaskResponseBody body;

    public static GetExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExportTaskResponse self = new GetExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExportTaskResponse setBody(GetExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExportTaskResponseBody getBody() {
        return this.body;
    }

}
