// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdatePartitionColumnStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePartitionColumnStatisticsResponseBody body;

    public static UpdatePartitionColumnStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePartitionColumnStatisticsResponse self = new UpdatePartitionColumnStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePartitionColumnStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePartitionColumnStatisticsResponse setBody(UpdatePartitionColumnStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePartitionColumnStatisticsResponseBody getBody() {
        return this.body;
    }

}
