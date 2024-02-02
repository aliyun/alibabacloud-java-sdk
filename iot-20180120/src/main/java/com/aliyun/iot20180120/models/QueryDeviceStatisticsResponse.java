// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceStatisticsResponseBody body;

    public static QueryDeviceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatisticsResponse self = new QueryDeviceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceStatisticsResponse setBody(QueryDeviceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceStatisticsResponseBody getBody() {
        return this.body;
    }

}
