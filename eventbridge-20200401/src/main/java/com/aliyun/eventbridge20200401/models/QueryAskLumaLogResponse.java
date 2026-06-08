// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryAskLumaLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAskLumaLogResponseBody body;

    public static QueryAskLumaLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAskLumaLogResponse self = new QueryAskLumaLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryAskLumaLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAskLumaLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAskLumaLogResponse setBody(QueryAskLumaLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAskLumaLogResponseBody getBody() {
        return this.body;
    }

}
