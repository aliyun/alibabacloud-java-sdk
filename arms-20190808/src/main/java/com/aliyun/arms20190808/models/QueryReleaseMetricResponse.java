// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryReleaseMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryReleaseMetricResponseBody body;

    public static QueryReleaseMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReleaseMetricResponse self = new QueryReleaseMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryReleaseMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReleaseMetricResponse setBody(QueryReleaseMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReleaseMetricResponseBody getBody() {
        return this.body;
    }

}
