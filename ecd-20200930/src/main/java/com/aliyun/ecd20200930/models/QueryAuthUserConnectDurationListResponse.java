// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryAuthUserConnectDurationListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAuthUserConnectDurationListResponseBody body;

    public static QueryAuthUserConnectDurationListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthUserConnectDurationListResponse self = new QueryAuthUserConnectDurationListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthUserConnectDurationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuthUserConnectDurationListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAuthUserConnectDurationListResponse setBody(QueryAuthUserConnectDurationListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuthUserConnectDurationListResponseBody getBody() {
        return this.body;
    }

}
