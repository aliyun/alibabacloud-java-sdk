// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetBatchExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchExportTaskResponseBody body;

    public static GetBatchExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchExportTaskResponse self = new GetBatchExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchExportTaskResponse setBody(GetBatchExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchExportTaskResponseBody getBody() {
        return this.body;
    }

}
