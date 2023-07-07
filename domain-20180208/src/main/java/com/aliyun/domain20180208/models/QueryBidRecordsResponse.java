// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBidRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBidRecordsResponseBody body;

    public static QueryBidRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBidRecordsResponse self = new QueryBidRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBidRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBidRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBidRecordsResponse setBody(QueryBidRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBidRecordsResponseBody getBody() {
        return this.body;
    }

}
