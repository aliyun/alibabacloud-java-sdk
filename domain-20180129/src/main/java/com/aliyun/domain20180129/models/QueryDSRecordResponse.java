// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDSRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDSRecordResponseBody body;

    public static QueryDSRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDSRecordResponse self = new QueryDSRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryDSRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDSRecordResponse setBody(QueryDSRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDSRecordResponseBody getBody() {
        return this.body;
    }

}
