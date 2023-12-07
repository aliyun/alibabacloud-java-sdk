// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class QueryApmGrafanaDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryApmGrafanaDataResponseBody body;

    public static QueryApmGrafanaDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApmGrafanaDataResponse self = new QueryApmGrafanaDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryApmGrafanaDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryApmGrafanaDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryApmGrafanaDataResponse setBody(QueryApmGrafanaDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryApmGrafanaDataResponseBody getBody() {
        return this.body;
    }

}
