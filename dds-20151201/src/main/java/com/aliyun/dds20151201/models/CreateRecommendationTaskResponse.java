// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateRecommendationTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRecommendationTaskResponseBody body;

    public static CreateRecommendationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecommendationTaskResponse self = new CreateRecommendationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecommendationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecommendationTaskResponse setBody(CreateRecommendationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecommendationTaskResponseBody getBody() {
        return this.body;
    }

}
