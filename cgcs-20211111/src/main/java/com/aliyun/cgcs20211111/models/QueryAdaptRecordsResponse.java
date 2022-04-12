// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryAdaptRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAdaptRecordsResponseBody body;

    public static QueryAdaptRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAdaptRecordsResponse self = new QueryAdaptRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAdaptRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAdaptRecordsResponse setBody(QueryAdaptRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAdaptRecordsResponseBody getBody() {
        return this.body;
    }

}
