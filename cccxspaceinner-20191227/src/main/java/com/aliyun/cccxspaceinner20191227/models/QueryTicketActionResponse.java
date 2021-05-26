// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryTicketActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTicketActionResponseBody body;

    public static QueryTicketActionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketActionResponse self = new QueryTicketActionResponse();
        return TeaModel.build(map, self);
    }

    public QueryTicketActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTicketActionResponse setBody(QueryTicketActionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTicketActionResponseBody getBody() {
        return this.body;
    }

}
