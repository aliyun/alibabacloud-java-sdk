// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryScaleUpOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryScaleUpOrderResponseBody body;

    public static QueryScaleUpOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScaleUpOrderResponse self = new QueryScaleUpOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryScaleUpOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryScaleUpOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryScaleUpOrderResponse setBody(QueryScaleUpOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScaleUpOrderResponseBody getBody() {
        return this.body;
    }

}
