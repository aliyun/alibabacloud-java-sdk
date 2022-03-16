// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryRenewInstancePriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryRenewInstancePriceResponse setBody(QueryRenewInstancePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRenewInstancePriceResponseBody getBody() {
        return this.body;
    }

}
