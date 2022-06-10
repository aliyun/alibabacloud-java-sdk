// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryItemInventoryResponseBody body;

    public static QueryItemInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInventoryResponse self = new QueryItemInventoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemInventoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryItemInventoryResponse setBody(QueryItemInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemInventoryResponseBody getBody() {
        return this.body;
    }

}
