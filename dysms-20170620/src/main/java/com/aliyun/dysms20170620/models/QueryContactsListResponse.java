// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryContactsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryContactsListResponseBody body;

    public static QueryContactsListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContactsListResponse self = new QueryContactsListResponse();
        return TeaModel.build(map, self);
    }

    public QueryContactsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryContactsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryContactsListResponse setBody(QueryContactsListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryContactsListResponseBody getBody() {
        return this.body;
    }

}
