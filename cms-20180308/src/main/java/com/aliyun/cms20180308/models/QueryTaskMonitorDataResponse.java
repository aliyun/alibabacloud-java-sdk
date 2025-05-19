// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryTaskMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTaskMonitorDataResponseBody body;

    public static QueryTaskMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskMonitorDataResponse self = new QueryTaskMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskMonitorDataResponse setBody(QueryTaskMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskMonitorDataResponseBody getBody() {
        return this.body;
    }

}
