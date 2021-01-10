// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaFpDeleteJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaFpDeleteJobListResponseBody body;

    public static QueryMediaFpDeleteJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaFpDeleteJobListResponse self = new QueryMediaFpDeleteJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaFpDeleteJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaFpDeleteJobListResponse setBody(QueryMediaFpDeleteJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaFpDeleteJobListResponseBody getBody() {
        return this.body;
    }

}
