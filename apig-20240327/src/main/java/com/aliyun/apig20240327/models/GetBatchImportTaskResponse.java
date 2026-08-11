// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetBatchImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchImportTaskResponseBody body;

    public static GetBatchImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchImportTaskResponse self = new GetBatchImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchImportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchImportTaskResponse setBody(GetBatchImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchImportTaskResponseBody getBody() {
        return this.body;
    }

}
