// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDnsHostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDnsHostResponseBody body;

    public static QueryDnsHostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDnsHostResponse self = new QueryDnsHostResponse();
        return TeaModel.build(map, self);
    }

    public QueryDnsHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDnsHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDnsHostResponse setBody(QueryDnsHostResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDnsHostResponseBody getBody() {
        return this.body;
    }

}
