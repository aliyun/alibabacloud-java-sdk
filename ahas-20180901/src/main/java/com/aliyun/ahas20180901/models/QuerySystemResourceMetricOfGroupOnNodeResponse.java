// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySystemResourceMetricOfGroupOnNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySystemResourceMetricOfGroupOnNodeResponseBody body;

    public static QuerySystemResourceMetricOfGroupOnNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemResourceMetricOfGroupOnNodeResponse self = new QuerySystemResourceMetricOfGroupOnNodeResponse();
        return TeaModel.build(map, self);
    }

    public QuerySystemResourceMetricOfGroupOnNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySystemResourceMetricOfGroupOnNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySystemResourceMetricOfGroupOnNodeResponse setBody(QuerySystemResourceMetricOfGroupOnNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySystemResourceMetricOfGroupOnNodeResponseBody getBody() {
        return this.body;
    }

}
