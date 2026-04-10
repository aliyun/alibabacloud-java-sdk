// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryRedemptionRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRedemptionRecordsResponseBody body;

    public static QueryRedemptionRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRedemptionRecordsResponse self = new QueryRedemptionRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRedemptionRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRedemptionRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRedemptionRecordsResponse setBody(QueryRedemptionRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRedemptionRecordsResponseBody getBody() {
        return this.body;
    }

}
