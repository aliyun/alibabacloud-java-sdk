// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBizItemsResponseBody body;

    public static QueryBizItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemsResponse self = new QueryBizItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBizItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBizItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBizItemsResponse setBody(QueryBizItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBizItemsResponseBody getBody() {
        return this.body;
    }

}
