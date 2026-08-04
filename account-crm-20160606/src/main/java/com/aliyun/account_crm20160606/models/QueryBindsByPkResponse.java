// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryBindsByPkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBindsByPkResponseBody body;

    public static QueryBindsByPkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBindsByPkResponse self = new QueryBindsByPkResponse();
        return TeaModel.build(map, self);
    }

    public QueryBindsByPkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBindsByPkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBindsByPkResponse setBody(QueryBindsByPkResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBindsByPkResponseBody getBody() {
        return this.body;
    }

}
