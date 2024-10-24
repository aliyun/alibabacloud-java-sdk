// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatasetVersionLabelsResponseBody body;

    public static CreateDatasetVersionLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetVersionLabelsResponse self = new CreateDatasetVersionLabelsResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasetVersionLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasetVersionLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatasetVersionLabelsResponse setBody(CreateDatasetVersionLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetVersionLabelsResponseBody getBody() {
        return this.body;
    }

}
