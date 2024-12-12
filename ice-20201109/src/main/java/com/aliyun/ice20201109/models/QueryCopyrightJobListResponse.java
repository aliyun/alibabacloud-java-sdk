// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryCopyrightJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCopyrightJobListResponseBody body;

    public static QueryCopyrightJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightJobListResponse self = new QueryCopyrightJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCopyrightJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCopyrightJobListResponse setBody(QueryCopyrightJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCopyrightJobListResponseBody getBody() {
        return this.body;
    }

}
