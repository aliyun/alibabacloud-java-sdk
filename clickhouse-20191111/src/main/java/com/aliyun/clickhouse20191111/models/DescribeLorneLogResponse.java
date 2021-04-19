// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLorneLogResponseBody body;

    public static DescribeLorneLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneLogResponse self = new DescribeLorneLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLorneLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLorneLogResponse setBody(DescribeLorneLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLorneLogResponseBody getBody() {
        return this.body;
    }

}
