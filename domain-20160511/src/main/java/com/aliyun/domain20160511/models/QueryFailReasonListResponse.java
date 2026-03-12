// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryFailReasonListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFailReasonListResponseBody body;

    public static QueryFailReasonListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonListResponse self = new QueryFailReasonListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFailReasonListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFailReasonListResponse setBody(QueryFailReasonListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFailReasonListResponseBody getBody() {
        return this.body;
    }

}
