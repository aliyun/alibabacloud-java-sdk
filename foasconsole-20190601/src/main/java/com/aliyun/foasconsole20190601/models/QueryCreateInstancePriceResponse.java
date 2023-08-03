// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryCreateInstancePriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCreateInstancePriceResponseBody body;

    public static QueryCreateInstancePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreateInstancePriceResponse self = new QueryCreateInstancePriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreateInstancePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCreateInstancePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCreateInstancePriceResponse setBody(QueryCreateInstancePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCreateInstancePriceResponseBody getBody() {
        return this.body;
    }

}
