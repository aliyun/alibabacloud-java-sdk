// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteMaterializedViewRecommendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMaterializedViewRecommendResponseBody body;

    public static DeleteMaterializedViewRecommendResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterializedViewRecommendResponse self = new DeleteMaterializedViewRecommendResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMaterializedViewRecommendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMaterializedViewRecommendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMaterializedViewRecommendResponse setBody(DeleteMaterializedViewRecommendResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMaterializedViewRecommendResponseBody getBody() {
        return this.body;
    }

}
