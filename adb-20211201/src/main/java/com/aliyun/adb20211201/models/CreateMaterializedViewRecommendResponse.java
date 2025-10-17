// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateMaterializedViewRecommendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMaterializedViewRecommendResponseBody body;

    public static CreateMaterializedViewRecommendResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMaterializedViewRecommendResponse self = new CreateMaterializedViewRecommendResponse();
        return TeaModel.build(map, self);
    }

    public CreateMaterializedViewRecommendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMaterializedViewRecommendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMaterializedViewRecommendResponse setBody(CreateMaterializedViewRecommendResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMaterializedViewRecommendResponseBody getBody() {
        return this.body;
    }

}
