// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpDBDeleteJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFpDBDeleteJobListResponseBody body;

    public static QueryFpDBDeleteJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFpDBDeleteJobListResponse self = new QueryFpDBDeleteJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFpDBDeleteJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFpDBDeleteJobListResponse setBody(QueryFpDBDeleteJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFpDBDeleteJobListResponseBody getBody() {
        return this.body;
    }

}
