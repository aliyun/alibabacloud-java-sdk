// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryConvertPrepayInstancePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConvertPrepayInstancePriceResponseBody body;

    public static QueryConvertPrepayInstancePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConvertPrepayInstancePriceResponse self = new QueryConvertPrepayInstancePriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryConvertPrepayInstancePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConvertPrepayInstancePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConvertPrepayInstancePriceResponse setBody(QueryConvertPrepayInstancePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConvertPrepayInstancePriceResponseBody getBody() {
        return this.body;
    }

}
