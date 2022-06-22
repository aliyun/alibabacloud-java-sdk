// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubPodOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyKubPodOverviewResponseBody body;

    public static QueryTopologyKubPodOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubPodOverviewResponse self = new QueryTopologyKubPodOverviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubPodOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyKubPodOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyKubPodOverviewResponse setBody(QueryTopologyKubPodOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyKubPodOverviewResponseBody getBody() {
        return this.body;
    }

}
