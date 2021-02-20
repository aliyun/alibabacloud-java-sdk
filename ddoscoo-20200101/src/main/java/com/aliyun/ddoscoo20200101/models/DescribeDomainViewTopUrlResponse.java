// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainViewTopUrlResponseBody body;

    public static DescribeDomainViewTopUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewTopUrlResponse self = new DescribeDomainViewTopUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewTopUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainViewTopUrlResponse setBody(DescribeDomainViewTopUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainViewTopUrlResponseBody getBody() {
        return this.body;
    }

}
