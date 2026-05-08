// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryQwenConferenceSgTicketSearchPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryQwenConferenceSgTicketSearchPopResponseBody body;

    public static QueryQwenConferenceSgTicketSearchPopResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQwenConferenceSgTicketSearchPopResponse self = new QueryQwenConferenceSgTicketSearchPopResponse();
        return TeaModel.build(map, self);
    }

    public QueryQwenConferenceSgTicketSearchPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQwenConferenceSgTicketSearchPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryQwenConferenceSgTicketSearchPopResponse setBody(QueryQwenConferenceSgTicketSearchPopResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQwenConferenceSgTicketSearchPopResponseBody getBody() {
        return this.body;
    }

}
