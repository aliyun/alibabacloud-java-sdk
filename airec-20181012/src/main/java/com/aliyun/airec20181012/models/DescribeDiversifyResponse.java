// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeDiversifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDiversifyResponseBody body;

    public static DescribeDiversifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiversifyResponse self = new DescribeDiversifyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiversifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiversifyResponse setBody(DescribeDiversifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiversifyResponseBody getBody() {
        return this.body;
    }

}
