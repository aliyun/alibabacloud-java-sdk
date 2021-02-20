// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainQPSListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainQPSListResponseBody body;

    public static DescribeDomainQPSListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQPSListResponse self = new DescribeDomainQPSListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQPSListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainQPSListResponse setBody(DescribeDomainQPSListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainQPSListResponseBody getBody() {
        return this.body;
    }

}
