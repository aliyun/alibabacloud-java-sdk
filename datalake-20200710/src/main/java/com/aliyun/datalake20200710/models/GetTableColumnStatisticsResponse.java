// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableColumnStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableColumnStatisticsResponseBody body;

    public static GetTableColumnStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnStatisticsResponse self = new GetTableColumnStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetTableColumnStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableColumnStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableColumnStatisticsResponse setBody(GetTableColumnStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableColumnStatisticsResponseBody getBody() {
        return this.body;
    }

}
