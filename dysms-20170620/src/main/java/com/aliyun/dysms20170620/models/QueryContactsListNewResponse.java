// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryContactsListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryContactsListNewResponseBody body;

    public static QueryContactsListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContactsListNewResponse self = new QueryContactsListNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryContactsListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryContactsListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryContactsListNewResponse setBody(QueryContactsListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryContactsListNewResponseBody getBody() {
        return this.body;
    }

}
