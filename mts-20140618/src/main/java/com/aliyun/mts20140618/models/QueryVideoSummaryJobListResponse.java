// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryVideoSummaryJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryVideoSummaryJobListResponseBody body;

    public static QueryVideoSummaryJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoSummaryJobListResponse self = new QueryVideoSummaryJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryVideoSummaryJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVideoSummaryJobListResponse setBody(QueryVideoSummaryJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVideoSummaryJobListResponseBody getBody() {
        return this.body;
    }

}
