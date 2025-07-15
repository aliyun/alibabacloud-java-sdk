// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QueryLiveDomainMultiStreamListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLiveDomainMultiStreamListResponseBody body;

    public static QueryLiveDomainMultiStreamListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveDomainMultiStreamListResponse self = new QueryLiveDomainMultiStreamListResponse();
        return TeaModel.build(map, self);
    }

    public QueryLiveDomainMultiStreamListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLiveDomainMultiStreamListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLiveDomainMultiStreamListResponse setBody(QueryLiveDomainMultiStreamListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLiveDomainMultiStreamListResponseBody getBody() {
        return this.body;
    }

}
