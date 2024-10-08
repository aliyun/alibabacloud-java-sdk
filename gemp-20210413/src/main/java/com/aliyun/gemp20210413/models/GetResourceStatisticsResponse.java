// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetResourceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceStatisticsResponseBody body;

    public static GetResourceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceStatisticsResponse self = new GetResourceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceStatisticsResponse setBody(GetResourceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceStatisticsResponseBody getBody() {
        return this.body;
    }

}
