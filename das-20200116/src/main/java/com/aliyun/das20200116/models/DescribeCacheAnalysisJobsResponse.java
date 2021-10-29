// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCacheAnalysisJobsResponse setBody(DescribeCacheAnalysisJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCacheAnalysisJobsResponseBody getBody() {
        return this.body;
    }

}
