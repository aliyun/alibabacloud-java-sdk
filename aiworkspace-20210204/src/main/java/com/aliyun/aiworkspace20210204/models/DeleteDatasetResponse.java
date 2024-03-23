// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatasetResponseBody body;

    public static DeleteDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetResponse self = new DeleteDatasetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatasetResponse setBody(DeleteDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasetResponseBody getBody() {
        return this.body;
    }

}
