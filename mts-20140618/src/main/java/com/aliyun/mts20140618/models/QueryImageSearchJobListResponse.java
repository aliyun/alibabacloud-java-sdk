// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryImageSearchJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryImageSearchJobListResponseBody body;

    public static QueryImageSearchJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImageSearchJobListResponse self = new QueryImageSearchJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryImageSearchJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryImageSearchJobListResponse setBody(QueryImageSearchJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryImageSearchJobListResponseBody getBody() {
        return this.body;
    }

}
