// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySingleSystemResourceMetricOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySingleSystemResourceMetricOfResourceResponseBody body;

    public static QuerySingleSystemResourceMetricOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleSystemResourceMetricOfResourceResponse self = new QuerySingleSystemResourceMetricOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySingleSystemResourceMetricOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySingleSystemResourceMetricOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySingleSystemResourceMetricOfResourceResponse setBody(QuerySingleSystemResourceMetricOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySingleSystemResourceMetricOfResourceResponseBody getBody() {
        return this.body;
    }

}
