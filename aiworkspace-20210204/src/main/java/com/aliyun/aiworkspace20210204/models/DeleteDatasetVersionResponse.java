// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatasetVersionResponseBody body;

    public static DeleteDatasetVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetVersionResponse self = new DeleteDatasetVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasetVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatasetVersionResponse setBody(DeleteDatasetVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasetVersionResponseBody getBody() {
        return this.body;
    }

}
