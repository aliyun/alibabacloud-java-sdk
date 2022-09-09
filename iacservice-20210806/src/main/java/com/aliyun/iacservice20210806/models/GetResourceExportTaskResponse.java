// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetResourceExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceExportTaskResponseBody body;

    public static GetResourceExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceExportTaskResponse self = new GetResourceExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceExportTaskResponse setBody(GetResourceExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceExportTaskResponseBody getBody() {
        return this.body;
    }

}
