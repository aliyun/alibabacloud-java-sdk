// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryScaleUpPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryScaleUpPriceResponse setBody(QueryScaleUpPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScaleUpPriceResponseBody getBody() {
        return this.body;
    }

}
