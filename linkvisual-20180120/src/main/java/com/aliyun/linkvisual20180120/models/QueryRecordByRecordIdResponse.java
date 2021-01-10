// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordByRecordIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRecordByRecordIdResponseBody body;

    public static QueryRecordByRecordIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordByRecordIdResponse self = new QueryRecordByRecordIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordByRecordIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordByRecordIdResponse setBody(QueryRecordByRecordIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordByRecordIdResponseBody getBody() {
        return this.body;
    }

}
