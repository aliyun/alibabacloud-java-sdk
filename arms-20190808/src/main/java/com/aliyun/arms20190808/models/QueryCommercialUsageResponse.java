// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryCommercialUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCommercialUsageResponseBody body;

    public static QueryCommercialUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommercialUsageResponse self = new QueryCommercialUsageResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommercialUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCommercialUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCommercialUsageResponse setBody(QueryCommercialUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCommercialUsageResponseBody getBody() {
        return this.body;
    }

}
