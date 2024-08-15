// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIncidentStatisticsResponseBody body;

    public static GetIncidentStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentStatisticsResponse self = new GetIncidentStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetIncidentStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIncidentStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIncidentStatisticsResponse setBody(GetIncidentStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIncidentStatisticsResponseBody getBody() {
        return this.body;
    }

}
