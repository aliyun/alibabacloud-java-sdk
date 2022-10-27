// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryShopIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryShopIndexResponseBody body;

    public static QueryShopIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShopIndexResponse self = new QueryShopIndexResponse();
        return TeaModel.build(map, self);
    }

    public QueryShopIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryShopIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryShopIndexResponse setBody(QueryShopIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryShopIndexResponseBody getBody() {
        return this.body;
    }

}
