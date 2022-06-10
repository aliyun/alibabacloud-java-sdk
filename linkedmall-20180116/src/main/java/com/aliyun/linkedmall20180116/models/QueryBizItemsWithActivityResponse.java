// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemsWithActivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBizItemsWithActivityResponseBody body;

    public static QueryBizItemsWithActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemsWithActivityResponse self = new QueryBizItemsWithActivityResponse();
        return TeaModel.build(map, self);
    }

    public QueryBizItemsWithActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBizItemsWithActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBizItemsWithActivityResponse setBody(QueryBizItemsWithActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBizItemsWithActivityResponseBody getBody() {
        return this.body;
    }

}
