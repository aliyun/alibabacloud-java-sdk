// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class QueryMetricByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMetricByPageResponseBody body;

    public static QueryMetricByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricByPageResponse self = new QueryMetricByPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMetricByPageResponse setBody(QueryMetricByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMetricByPageResponseBody getBody() {
        return this.body;
    }

}
