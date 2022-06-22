// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyHostOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyHostOverviewResponseBody body;

    public static QueryTopologyHostOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyHostOverviewResponse self = new QueryTopologyHostOverviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyHostOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyHostOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyHostOverviewResponse setBody(QueryTopologyHostOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyHostOverviewResponseBody getBody() {
        return this.body;
    }

}
