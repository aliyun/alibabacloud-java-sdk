// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCommodityListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCommodityListResponseBody body;

    public static QueryCommodityListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityListResponse self = new QueryCommodityListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommodityListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCommodityListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCommodityListResponse setBody(QueryCommodityListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCommodityListResponseBody getBody() {
        return this.body;
    }

}
