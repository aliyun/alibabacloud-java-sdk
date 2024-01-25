// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventStatisticsResponseBody body;

    public static GetEventStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventStatisticsResponse self = new GetEventStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetEventStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventStatisticsResponse setBody(GetEventStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventStatisticsResponseBody getBody() {
        return this.body;
    }

}
