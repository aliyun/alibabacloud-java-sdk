// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneTasksMCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLorneTasksMCountResponseBody body;

    public static DescribeLorneTasksMCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneTasksMCountResponse self = new DescribeLorneTasksMCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLorneTasksMCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLorneTasksMCountResponse setBody(DescribeLorneTasksMCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLorneTasksMCountResponseBody getBody() {
        return this.body;
    }

}
