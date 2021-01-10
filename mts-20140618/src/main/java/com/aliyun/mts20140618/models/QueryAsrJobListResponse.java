// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAsrJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAsrJobListResponseBody body;

    public static QueryAsrJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAsrJobListResponse self = new QueryAsrJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAsrJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAsrJobListResponse setBody(QueryAsrJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAsrJobListResponseBody getBody() {
        return this.body;
    }

}
