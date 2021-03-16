// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpFileDeleteJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFpFileDeleteJobListResponseBody body;

    public static QueryFpFileDeleteJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFpFileDeleteJobListResponse self = new QueryFpFileDeleteJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFpFileDeleteJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFpFileDeleteJobListResponse setBody(QueryFpFileDeleteJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFpFileDeleteJobListResponseBody getBody() {
        return this.body;
    }

}
