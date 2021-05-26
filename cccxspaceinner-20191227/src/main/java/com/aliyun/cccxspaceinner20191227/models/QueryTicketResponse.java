// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTicketResponseBody body;

    public static QueryTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketResponse self = new QueryTicketResponse();
        return TeaModel.build(map, self);
    }

    public QueryTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTicketResponse setBody(QueryTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTicketResponseBody getBody() {
        return this.body;
    }

}
