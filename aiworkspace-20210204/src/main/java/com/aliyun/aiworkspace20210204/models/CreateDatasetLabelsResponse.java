// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatasetLabelsResponseBody body;

    public static CreateDatasetLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetLabelsResponse self = new CreateDatasetLabelsResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasetLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasetLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatasetLabelsResponse setBody(CreateDatasetLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetLabelsResponseBody getBody() {
        return this.body;
    }

}
