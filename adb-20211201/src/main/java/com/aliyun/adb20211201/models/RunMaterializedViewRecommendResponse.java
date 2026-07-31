// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RunMaterializedViewRecommendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunMaterializedViewRecommendResponseBody body;

    public static RunMaterializedViewRecommendResponse build(java.util.Map<String, ?> map) throws Exception {
        RunMaterializedViewRecommendResponse self = new RunMaterializedViewRecommendResponse();
        return TeaModel.build(map, self);
    }

    public RunMaterializedViewRecommendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunMaterializedViewRecommendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunMaterializedViewRecommendResponse setBody(RunMaterializedViewRecommendResponseBody body) {
        this.body = body;
        return this;
    }
    public RunMaterializedViewRecommendResponseBody getBody() {
        return this.body;
    }

}
