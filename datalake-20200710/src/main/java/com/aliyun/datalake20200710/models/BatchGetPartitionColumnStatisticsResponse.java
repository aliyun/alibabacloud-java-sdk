// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGetPartitionColumnStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetPartitionColumnStatisticsResponseBody body;

    public static BatchGetPartitionColumnStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetPartitionColumnStatisticsResponse self = new BatchGetPartitionColumnStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetPartitionColumnStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetPartitionColumnStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetPartitionColumnStatisticsResponse setBody(BatchGetPartitionColumnStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetPartitionColumnStatisticsResponseBody getBody() {
        return this.body;
    }

}
