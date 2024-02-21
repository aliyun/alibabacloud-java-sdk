// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCacheAnalysisJobsResponseBody body;

    public static DescribeCacheAnalysisJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisJobsResponse self = new DescribeCacheAnalysisJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCacheAnalysisJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCacheAnalysisJobsResponse setBody(DescribeCacheAnalysisJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCacheAnalysisJobsResponseBody getBody() {
        return this.body;
    }

}
