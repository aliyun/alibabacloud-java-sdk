// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCacheAnalysisJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCacheAnalysisJobResponseBody body;

    public static CreateCacheAnalysisJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheAnalysisJobResponse self = new CreateCacheAnalysisJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateCacheAnalysisJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCacheAnalysisJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCacheAnalysisJobResponse setBody(CreateCacheAnalysisJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCacheAnalysisJobResponseBody getBody() {
        return this.body;
    }

}
