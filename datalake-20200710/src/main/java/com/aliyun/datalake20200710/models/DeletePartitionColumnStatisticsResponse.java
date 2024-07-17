// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeletePartitionColumnStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePartitionColumnStatisticsResponseBody body;

    public static DeletePartitionColumnStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePartitionColumnStatisticsResponse self = new DeletePartitionColumnStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DeletePartitionColumnStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePartitionColumnStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePartitionColumnStatisticsResponse setBody(DeletePartitionColumnStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePartitionColumnStatisticsResponseBody getBody() {
        return this.body;
    }

}
