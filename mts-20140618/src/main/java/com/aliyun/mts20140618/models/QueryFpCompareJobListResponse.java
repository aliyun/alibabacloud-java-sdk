// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpCompareJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFpCompareJobListResponseBody body;

    public static QueryFpCompareJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFpCompareJobListResponse self = new QueryFpCompareJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFpCompareJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFpCompareJobListResponse setBody(QueryFpCompareJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFpCompareJobListResponseBody getBody() {
        return this.body;
    }

}
