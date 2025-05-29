// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class QueryTokenUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTokenUsageResponseBody body;

    public static QueryTokenUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenUsageResponse self = new QueryTokenUsageResponse();
        return TeaModel.build(map, self);
    }

    public QueryTokenUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTokenUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTokenUsageResponse setBody(QueryTokenUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTokenUsageResponseBody getBody() {
        return this.body;
    }

}
