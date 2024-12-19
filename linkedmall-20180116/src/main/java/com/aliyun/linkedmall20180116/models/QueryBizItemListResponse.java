// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBizItemListResponseBody body;

    public static QueryBizItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListResponse self = new QueryBizItemListResponse();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBizItemListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBizItemListResponse setBody(QueryBizItemListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBizItemListResponseBody getBody() {
        return this.body;
    }

}
