// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateTableColumnStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTableColumnStatisticsResponseBody body;

    public static UpdateTableColumnStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableColumnStatisticsResponse self = new UpdateTableColumnStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableColumnStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableColumnStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTableColumnStatisticsResponse setBody(UpdateTableColumnStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableColumnStatisticsResponseBody getBody() {
        return this.body;
    }

}
