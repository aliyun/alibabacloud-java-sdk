// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryConvertInstancePriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryConvertInstancePriceResponseBody body;

    public static QueryConvertInstancePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConvertInstancePriceResponse self = new QueryConvertInstancePriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryConvertInstancePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConvertInstancePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConvertInstancePriceResponse setBody(QueryConvertInstancePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConvertInstancePriceResponseBody getBody() {
        return this.body;
    }

}
