// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class QueryServicePackAndPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryServicePackAndPriceResponse setBody(QueryServicePackAndPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryServicePackAndPriceResponseBody getBody() {
        return this.body;
    }

}
