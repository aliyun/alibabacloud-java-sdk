// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpShotJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFpShotJobListResponseBody body;

    public static QueryFpShotJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFpShotJobListResponse self = new QueryFpShotJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFpShotJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFpShotJobListResponse setBody(QueryFpShotJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFpShotJobListResponseBody getBody() {
        return this.body;
    }

}
