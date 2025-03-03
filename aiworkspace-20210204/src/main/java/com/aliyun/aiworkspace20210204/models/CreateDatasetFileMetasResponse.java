// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetFileMetasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatasetFileMetasResponseBody body;

    public static CreateDatasetFileMetasResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetFileMetasResponse self = new CreateDatasetFileMetasResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasetFileMetasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasetFileMetasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatasetFileMetasResponse setBody(CreateDatasetFileMetasResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetFileMetasResponseBody getBody() {
        return this.body;
    }

}
