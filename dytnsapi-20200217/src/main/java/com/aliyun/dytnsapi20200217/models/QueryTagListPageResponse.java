// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTagListPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTagListPageResponseBody body;

    public static QueryTagListPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagListPageResponse self = new QueryTagListPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagListPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagListPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTagListPageResponse setBody(QueryTagListPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagListPageResponseBody getBody() {
        return this.body;
    }

}
