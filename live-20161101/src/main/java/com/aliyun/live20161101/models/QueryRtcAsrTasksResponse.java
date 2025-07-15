// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QueryRtcAsrTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRtcAsrTasksResponseBody body;

    public static QueryRtcAsrTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtcAsrTasksResponse self = new QueryRtcAsrTasksResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtcAsrTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRtcAsrTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRtcAsrTasksResponse setBody(QueryRtcAsrTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRtcAsrTasksResponseBody getBody() {
        return this.body;
    }

}
