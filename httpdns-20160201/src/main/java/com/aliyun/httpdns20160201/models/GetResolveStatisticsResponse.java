// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetResolveStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResolveStatisticsResponseBody body;

    public static GetResolveStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResolveStatisticsResponse self = new GetResolveStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetResolveStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResolveStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResolveStatisticsResponse setBody(GetResolveStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResolveStatisticsResponseBody getBody() {
        return this.body;
    }

}
