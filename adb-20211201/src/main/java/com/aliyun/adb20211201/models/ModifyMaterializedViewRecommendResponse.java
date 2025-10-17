// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyMaterializedViewRecommendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMaterializedViewRecommendResponseBody body;

    public static ModifyMaterializedViewRecommendResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaterializedViewRecommendResponse self = new ModifyMaterializedViewRecommendResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMaterializedViewRecommendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMaterializedViewRecommendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMaterializedViewRecommendResponse setBody(ModifyMaterializedViewRecommendResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMaterializedViewRecommendResponseBody getBody() {
        return this.body;
    }

}
