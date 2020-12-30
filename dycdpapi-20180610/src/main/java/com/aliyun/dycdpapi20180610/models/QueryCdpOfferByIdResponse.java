// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dycdpapi20180610.models;

import com.aliyun.tea.*;

public class QueryCdpOfferByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCdpOfferByIdResponseBody body;

    public static QueryCdpOfferByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCdpOfferByIdResponse self = new QueryCdpOfferByIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryCdpOfferByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCdpOfferByIdResponse setBody(QueryCdpOfferByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCdpOfferByIdResponseBody getBody() {
        return this.body;
    }

}
