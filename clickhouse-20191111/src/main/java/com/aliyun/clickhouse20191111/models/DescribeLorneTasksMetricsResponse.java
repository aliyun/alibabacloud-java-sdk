// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneTasksMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLorneTasksMetricsResponseBody body;

    public static DescribeLorneTasksMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneTasksMetricsResponse self = new DescribeLorneTasksMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLorneTasksMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLorneTasksMetricsResponse setBody(DescribeLorneTasksMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLorneTasksMetricsResponseBody getBody() {
        return this.body;
    }

}
