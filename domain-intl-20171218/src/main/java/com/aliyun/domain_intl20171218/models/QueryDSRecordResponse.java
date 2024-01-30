// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryDSRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryDSRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDSRecordResponse setBody(QueryDSRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDSRecordResponseBody getBody() {
        return this.body;
    }

}
