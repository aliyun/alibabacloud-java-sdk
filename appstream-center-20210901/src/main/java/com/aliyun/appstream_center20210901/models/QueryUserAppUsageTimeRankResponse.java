// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryUserAppUsageTimeRankResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserAppUsageTimeRankResponseBody body;

    public static QueryUserAppUsageTimeRankResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserAppUsageTimeRankResponse self = new QueryUserAppUsageTimeRankResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserAppUsageTimeRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserAppUsageTimeRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserAppUsageTimeRankResponse setBody(QueryUserAppUsageTimeRankResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserAppUsageTimeRankResponseBody getBody() {
        return this.body;
    }

}
