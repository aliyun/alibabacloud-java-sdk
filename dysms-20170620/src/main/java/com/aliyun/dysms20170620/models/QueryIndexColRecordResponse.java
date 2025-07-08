// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryIndexColRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIndexColRecordResponseBody body;

    public static QueryIndexColRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndexColRecordResponse self = new QueryIndexColRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndexColRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIndexColRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIndexColRecordResponse setBody(QueryIndexColRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIndexColRecordResponseBody getBody() {
        return this.body;
    }

}
