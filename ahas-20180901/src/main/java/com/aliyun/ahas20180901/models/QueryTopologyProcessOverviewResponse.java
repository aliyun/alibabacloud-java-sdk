// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyProcessOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyProcessOverviewResponseBody body;

    public static QueryTopologyProcessOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyProcessOverviewResponse self = new QueryTopologyProcessOverviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyProcessOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyProcessOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyProcessOverviewResponse setBody(QueryTopologyProcessOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyProcessOverviewResponseBody getBody() {
        return this.body;
    }

}
