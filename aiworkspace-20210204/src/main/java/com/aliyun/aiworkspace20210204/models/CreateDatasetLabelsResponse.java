// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateDatasetLabelsResponse setBody(CreateDatasetLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetLabelsResponseBody getBody() {
        return this.body;
    }

}
