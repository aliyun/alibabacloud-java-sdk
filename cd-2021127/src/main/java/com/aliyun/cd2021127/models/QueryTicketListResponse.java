// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryTicketListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTicketListResponseBody body;

    public static QueryTicketListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketListResponse self = new QueryTicketListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTicketListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTicketListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTicketListResponse setBody(QueryTicketListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTicketListResponseBody getBody() {
        return this.body;
    }

}
