// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class QueryRequestLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRequestLogsResponseBody body;

    public static QueryRequestLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRequestLogsResponse self = new QueryRequestLogsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRequestLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRequestLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRequestLogsResponse setBody(QueryRequestLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRequestLogsResponseBody getBody() {
        return this.body;
    }

}
