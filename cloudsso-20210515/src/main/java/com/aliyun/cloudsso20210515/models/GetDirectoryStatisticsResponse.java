// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectoryStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDirectoryStatisticsResponseBody body;

    public static GetDirectoryStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryStatisticsResponse self = new GetDirectoryStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetDirectoryStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDirectoryStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDirectoryStatisticsResponse setBody(GetDirectoryStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDirectoryStatisticsResponseBody getBody() {
        return this.body;
    }

}
