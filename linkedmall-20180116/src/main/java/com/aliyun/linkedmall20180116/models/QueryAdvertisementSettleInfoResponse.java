// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAdvertisementSettleInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAdvertisementSettleInfoResponseBody body;

    public static QueryAdvertisementSettleInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvertisementSettleInfoResponse self = new QueryAdvertisementSettleInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAdvertisementSettleInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAdvertisementSettleInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAdvertisementSettleInfoResponse setBody(QueryAdvertisementSettleInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAdvertisementSettleInfoResponseBody getBody() {
        return this.body;
    }

}
