// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteTableColumnStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTableColumnStatisticsResponseBody body;

    public static DeleteTableColumnStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableColumnStatisticsResponse self = new DeleteTableColumnStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTableColumnStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTableColumnStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTableColumnStatisticsResponse setBody(DeleteTableColumnStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTableColumnStatisticsResponseBody getBody() {
        return this.body;
    }

}
