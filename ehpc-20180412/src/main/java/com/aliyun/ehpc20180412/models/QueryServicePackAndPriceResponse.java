// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class QueryServicePackAndPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryServicePackAndPriceResponseBody body;

    public static QueryServicePackAndPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServicePackAndPriceResponse self = new QueryServicePackAndPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryServicePackAndPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryServicePackAndPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryServicePackAndPriceResponse setBody(QueryServicePackAndPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryServicePackAndPriceResponseBody getBody() {
        return this.body;
    }

}
