// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dycdpapi20180610.models;

import com.aliyun.tea.*;

public class QueryCdpOfferResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCdpOfferResponseBody body;

    public static QueryCdpOfferResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCdpOfferResponse self = new QueryCdpOfferResponse();
        return TeaModel.build(map, self);
    }

    public QueryCdpOfferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCdpOfferResponse setBody(QueryCdpOfferResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCdpOfferResponseBody getBody() {
        return this.body;
    }

}
