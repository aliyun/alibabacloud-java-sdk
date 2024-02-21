// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCacheAnalysisJobResponseBody body;

    public static DescribeCacheAnalysisJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisJobResponse self = new DescribeCacheAnalysisJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCacheAnalysisJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCacheAnalysisJobResponse setBody(DescribeCacheAnalysisJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCacheAnalysisJobResponseBody getBody() {
        return this.body;
    }

}
