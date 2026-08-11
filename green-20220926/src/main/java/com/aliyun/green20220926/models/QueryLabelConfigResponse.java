// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class QueryLabelConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLabelConfigResponseBody body;

    public static QueryLabelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLabelConfigResponse self = new QueryLabelConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryLabelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLabelConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLabelConfigResponse setBody(QueryLabelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLabelConfigResponseBody getBody() {
        return this.body;
    }

}
