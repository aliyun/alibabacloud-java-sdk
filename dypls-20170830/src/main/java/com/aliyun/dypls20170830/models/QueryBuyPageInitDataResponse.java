// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryBuyPageInitDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBuyPageInitDataResponseBody body;

    public static QueryBuyPageInitDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuyPageInitDataResponse self = new QueryBuyPageInitDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuyPageInitDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBuyPageInitDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBuyPageInitDataResponse setBody(QueryBuyPageInitDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBuyPageInitDataResponseBody getBody() {
        return this.body;
    }

}
