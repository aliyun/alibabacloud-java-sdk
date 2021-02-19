// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeLimitationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLimitationResponseBody body;

    public static DescribeLimitationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLimitationResponse self = new DescribeLimitationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLimitationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLimitationResponse setBody(DescribeLimitationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLimitationResponseBody getBody() {
        return this.body;
    }

}
