// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCacheAnalysisJobResponse setBody(DescribeCacheAnalysisJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCacheAnalysisJobResponseBody getBody() {
        return this.body;
    }

}
