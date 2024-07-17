// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetPartitionColumnStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPartitionColumnStatisticsResponseBody body;

    public static GetPartitionColumnStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionColumnStatisticsResponse self = new GetPartitionColumnStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetPartitionColumnStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPartitionColumnStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPartitionColumnStatisticsResponse setBody(GetPartitionColumnStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPartitionColumnStatisticsResponseBody getBody() {
        return this.body;
    }

}
