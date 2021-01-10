// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRecordUrlResponseBody body;

    public static QueryRecordUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordUrlResponse self = new QueryRecordUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordUrlResponse setBody(QueryRecordUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordUrlResponseBody getBody() {
        return this.body;
    }

}
