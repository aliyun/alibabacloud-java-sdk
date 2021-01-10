// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaInfoJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaInfoJobListResponseBody body;

    public static QueryMediaInfoJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaInfoJobListResponse self = new QueryMediaInfoJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaInfoJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaInfoJobListResponse setBody(QueryMediaInfoJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaInfoJobListResponseBody getBody() {
        return this.body;
    }

}
