// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DescribeTSAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTSAResponseBody body;

    public static DescribeTSAResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTSAResponse self = new DescribeTSAResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTSAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTSAResponse setBody(DescribeTSAResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTSAResponseBody getBody() {
        return this.body;
    }

}
