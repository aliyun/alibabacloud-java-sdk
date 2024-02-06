// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardStatusStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCardStatusStatisticsResponseBody body;

    public static GetCardStatusStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardStatusStatisticsResponse self = new GetCardStatusStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetCardStatusStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardStatusStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCardStatusStatisticsResponse setBody(GetCardStatusStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardStatusStatisticsResponseBody getBody() {
        return this.body;
    }

}
