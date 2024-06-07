// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubscriptionDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySubscriptionDetailResponseBody body;

    public static QuerySubscriptionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscriptionDetailResponse self = new QuerySubscriptionDetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySubscriptionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySubscriptionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySubscriptionDetailResponse setBody(QuerySubscriptionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySubscriptionDetailResponseBody getBody() {
        return this.body;
    }

}
