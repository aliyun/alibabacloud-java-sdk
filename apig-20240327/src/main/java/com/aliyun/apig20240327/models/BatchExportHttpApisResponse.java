// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchExportHttpApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchExportHttpApisResponseBody body;

    public static BatchExportHttpApisResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchExportHttpApisResponse self = new BatchExportHttpApisResponse();
        return TeaModel.build(map, self);
    }

    public BatchExportHttpApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchExportHttpApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchExportHttpApisResponse setBody(BatchExportHttpApisResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchExportHttpApisResponseBody getBody() {
        return this.body;
    }

}
