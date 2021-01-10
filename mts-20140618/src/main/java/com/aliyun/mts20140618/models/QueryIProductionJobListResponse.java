// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryIProductionJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIProductionJobListResponseBody body;

    public static QueryIProductionJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIProductionJobListResponse self = new QueryIProductionJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryIProductionJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIProductionJobListResponse setBody(QueryIProductionJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIProductionJobListResponseBody getBody() {
        return this.body;
    }

}
