// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetFileMetasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDatasetFileMetasResponseBody body;

    public static UpdateDatasetFileMetasResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetFileMetasResponse self = new UpdateDatasetFileMetasResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetFileMetasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDatasetFileMetasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDatasetFileMetasResponse setBody(UpdateDatasetFileMetasResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDatasetFileMetasResponseBody getBody() {
        return this.body;
    }

}
