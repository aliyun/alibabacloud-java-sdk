// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySystemStatResourceMetricOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySystemStatResourceMetricOfResourceResponseBody body;

    public static QuerySystemStatResourceMetricOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemStatResourceMetricOfResourceResponse self = new QuerySystemStatResourceMetricOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySystemStatResourceMetricOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySystemStatResourceMetricOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySystemStatResourceMetricOfResourceResponse setBody(QuerySystemStatResourceMetricOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySystemStatResourceMetricOfResourceResponseBody getBody() {
        return this.body;
    }

}
