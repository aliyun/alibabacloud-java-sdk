// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DescribeLedgersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLedgersResponseBody body;

    public static DescribeLedgersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLedgersResponse self = new DescribeLedgersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLedgersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLedgersResponse setBody(DescribeLedgersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLedgersResponseBody getBody() {
        return this.body;
    }

}
