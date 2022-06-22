// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySingleSystemResourceMetricOfResourceOnNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody body;

    public static QuerySingleSystemResourceMetricOfResourceOnNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleSystemResourceMetricOfResourceOnNodeResponse self = new QuerySingleSystemResourceMetricOfResourceOnNodeResponse();
        return TeaModel.build(map, self);
    }

    public QuerySingleSystemResourceMetricOfResourceOnNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySingleSystemResourceMetricOfResourceOnNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySingleSystemResourceMetricOfResourceOnNodeResponse setBody(QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySingleSystemResourceMetricOfResourceOnNodeResponseBody getBody() {
        return this.body;
    }

}
