// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineServiceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineServiceStatisticsResponseBody body;

    public static GetHotlineServiceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineServiceStatisticsResponse self = new GetHotlineServiceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineServiceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineServiceStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotlineServiceStatisticsResponse setBody(GetHotlineServiceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineServiceStatisticsResponseBody getBody() {
        return this.body;
    }

}
