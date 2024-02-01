// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordUrlByTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecordUrlByTimeResponseBody body;

    public static QueryRecordUrlByTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordUrlByTimeResponse self = new QueryRecordUrlByTimeResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordUrlByTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordUrlByTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecordUrlByTimeResponse setBody(QueryRecordUrlByTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordUrlByTimeResponseBody getBody() {
        return this.body;
    }

}
