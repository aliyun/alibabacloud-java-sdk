// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRecordResponseBody body;

    public static QueryRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordResponse self = new QueryRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordResponse setBody(QueryRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordResponseBody getBody() {
        return this.body;
    }

}
