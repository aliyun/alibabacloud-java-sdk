// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemGuideRetailPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryItemGuideRetailPriceResponseBody body;

    public static QueryItemGuideRetailPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemGuideRetailPriceResponse self = new QueryItemGuideRetailPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemGuideRetailPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemGuideRetailPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryItemGuideRetailPriceResponse setBody(QueryItemGuideRetailPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemGuideRetailPriceResponseBody getBody() {
        return this.body;
    }

}
