// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLorneTasksResponseBody body;

    public static DescribeLorneTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneTasksResponse self = new DescribeLorneTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLorneTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLorneTasksResponse setBody(DescribeLorneTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLorneTasksResponseBody getBody() {
        return this.body;
    }

}
