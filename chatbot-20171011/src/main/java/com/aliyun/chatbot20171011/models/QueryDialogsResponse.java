// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryDialogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDialogsResponseBody body;

    public static QueryDialogsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDialogsResponse self = new QueryDialogsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDialogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDialogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDialogsResponse setBody(QueryDialogsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDialogsResponseBody getBody() {
        return this.body;
    }

}
