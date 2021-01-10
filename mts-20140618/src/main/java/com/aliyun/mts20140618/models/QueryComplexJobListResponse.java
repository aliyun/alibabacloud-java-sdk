// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryComplexJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryComplexJobListResponseBody body;

    public static QueryComplexJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryComplexJobListResponse self = new QueryComplexJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryComplexJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryComplexJobListResponse setBody(QueryComplexJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryComplexJobListResponseBody getBody() {
        return this.body;
    }

}
