// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryModelUsageInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryModelUsageInfoResponseBody body;

    public static QueryModelUsageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModelUsageInfoResponse self = new QueryModelUsageInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryModelUsageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModelUsageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryModelUsageInfoResponse setBody(QueryModelUsageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModelUsageInfoResponseBody getBody() {
        return this.body;
    }

}
