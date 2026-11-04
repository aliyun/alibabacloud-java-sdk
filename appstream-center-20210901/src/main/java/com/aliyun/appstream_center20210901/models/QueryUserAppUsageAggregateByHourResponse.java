// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryUserAppUsageAggregateByHourResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserAppUsageAggregateByHourResponseBody body;

    public static QueryUserAppUsageAggregateByHourResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserAppUsageAggregateByHourResponse self = new QueryUserAppUsageAggregateByHourResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserAppUsageAggregateByHourResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserAppUsageAggregateByHourResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserAppUsageAggregateByHourResponse setBody(QueryUserAppUsageAggregateByHourResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserAppUsageAggregateByHourResponseBody getBody() {
        return this.body;
    }

}
