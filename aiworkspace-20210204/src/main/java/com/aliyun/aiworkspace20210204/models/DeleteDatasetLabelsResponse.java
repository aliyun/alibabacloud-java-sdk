// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDatasetLabelsResponseBody body;

    public static DeleteDatasetLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetLabelsResponse self = new DeleteDatasetLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasetLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatasetLabelsResponse setBody(DeleteDatasetLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasetLabelsResponseBody getBody() {
        return this.body;
    }

}
