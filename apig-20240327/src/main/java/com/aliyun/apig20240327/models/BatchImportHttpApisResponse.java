// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchImportHttpApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchImportHttpApisResponseBody body;

    public static BatchImportHttpApisResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchImportHttpApisResponse self = new BatchImportHttpApisResponse();
        return TeaModel.build(map, self);
    }

    public BatchImportHttpApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchImportHttpApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchImportHttpApisResponse setBody(BatchImportHttpApisResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchImportHttpApisResponseBody getBody() {
        return this.body;
    }

}
