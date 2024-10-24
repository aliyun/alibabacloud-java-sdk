// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetVersionLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatasetVersionLabelsResponseBody body;

    public static DeleteDatasetVersionLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetVersionLabelsResponse self = new DeleteDatasetVersionLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetVersionLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasetVersionLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatasetVersionLabelsResponse setBody(DeleteDatasetVersionLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasetVersionLabelsResponseBody getBody() {
        return this.body;
    }

}
