// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryPartnerProduceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPartnerProduceListResponseBody body;

    public static QueryPartnerProduceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnerProduceListResponse self = new QueryPartnerProduceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPartnerProduceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPartnerProduceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPartnerProduceListResponse setBody(QueryPartnerProduceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPartnerProduceListResponseBody getBody() {
        return this.body;
    }

}
