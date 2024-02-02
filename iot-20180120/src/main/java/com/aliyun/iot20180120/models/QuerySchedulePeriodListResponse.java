// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySchedulePeriodListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySchedulePeriodListResponseBody body;

    public static QuerySchedulePeriodListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySchedulePeriodListResponse self = new QuerySchedulePeriodListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySchedulePeriodListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySchedulePeriodListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySchedulePeriodListResponse setBody(QuerySchedulePeriodListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySchedulePeriodListResponseBody getBody() {
        return this.body;
    }

}
