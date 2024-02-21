// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryRenewInstancePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRenewInstancePriceResponseBody body;

    public static QueryRenewInstancePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewInstancePriceResponse self = new QueryRenewInstancePriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryRenewInstancePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRenewInstancePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRenewInstancePriceResponse setBody(QueryRenewInstancePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRenewInstancePriceResponseBody getBody() {
        return this.body;
    }

}
