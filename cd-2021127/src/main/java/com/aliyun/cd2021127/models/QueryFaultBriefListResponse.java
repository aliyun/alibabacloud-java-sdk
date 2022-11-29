// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryFaultBriefListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFaultBriefListResponseBody body;

    public static QueryFaultBriefListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaultBriefListResponse self = new QueryFaultBriefListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaultBriefListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaultBriefListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaultBriefListResponse setBody(QueryFaultBriefListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaultBriefListResponseBody getBody() {
        return this.body;
    }

}
