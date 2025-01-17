// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListWithCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBizItemListWithCacheResponseBody body;

    public static QueryBizItemListWithCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListWithCacheResponse self = new QueryBizItemListWithCacheResponse();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListWithCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBizItemListWithCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBizItemListWithCacheResponse setBody(QueryBizItemListWithCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBizItemListWithCacheResponseBody getBody() {
        return this.body;
    }

}
