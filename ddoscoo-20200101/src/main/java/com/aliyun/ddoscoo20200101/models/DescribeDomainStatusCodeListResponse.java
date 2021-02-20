// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainStatusCodeListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainStatusCodeListResponseBody body;

    public static DescribeDomainStatusCodeListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatusCodeListResponse self = new DescribeDomainStatusCodeListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatusCodeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainStatusCodeListResponse setBody(DescribeDomainStatusCodeListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainStatusCodeListResponseBody getBody() {
        return this.body;
    }

}
