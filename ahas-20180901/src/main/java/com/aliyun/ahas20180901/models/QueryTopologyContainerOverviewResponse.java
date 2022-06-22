// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyContainerOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyContainerOverviewResponseBody body;

    public static QueryTopologyContainerOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyContainerOverviewResponse self = new QueryTopologyContainerOverviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyContainerOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyContainerOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyContainerOverviewResponse setBody(QueryTopologyContainerOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyContainerOverviewResponseBody getBody() {
        return this.body;
    }

}
