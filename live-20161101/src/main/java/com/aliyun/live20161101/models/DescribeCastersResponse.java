// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCastersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCastersResponseBody body;

    public static DescribeCastersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCastersResponse self = new DescribeCastersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCastersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCastersResponse setBody(DescribeCastersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCastersResponseBody getBody() {
        return this.body;
    }

}
