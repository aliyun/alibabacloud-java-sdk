// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryScaleUpPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryScaleUpPriceResponseBody body;

    public static QueryScaleUpPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScaleUpPriceResponse self = new QueryScaleUpPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryScaleUpPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryScaleUpPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryScaleUpPriceResponse setBody(QueryScaleUpPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScaleUpPriceResponseBody getBody() {
        return this.body;
    }

}
