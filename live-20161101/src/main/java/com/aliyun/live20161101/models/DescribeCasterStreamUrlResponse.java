// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterStreamUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCasterStreamUrlResponseBody body;

    public static DescribeCasterStreamUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterStreamUrlResponse self = new DescribeCasterStreamUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterStreamUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterStreamUrlResponse setBody(DescribeCasterStreamUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterStreamUrlResponseBody getBody() {
        return this.body;
    }

}
