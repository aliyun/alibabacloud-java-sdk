// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyOverviewResponseBody body;

    public static QueryTopologyOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyOverviewResponse self = new QueryTopologyOverviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyOverviewResponse setBody(QueryTopologyOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyOverviewResponseBody getBody() {
        return this.body;
    }

}
