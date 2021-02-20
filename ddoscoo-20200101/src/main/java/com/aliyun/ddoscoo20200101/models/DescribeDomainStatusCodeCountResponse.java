// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainStatusCodeCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainStatusCodeCountResponseBody body;

    public static DescribeDomainStatusCodeCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatusCodeCountResponse self = new DescribeDomainStatusCodeCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatusCodeCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainStatusCodeCountResponse setBody(DescribeDomainStatusCodeCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainStatusCodeCountResponseBody getBody() {
        return this.body;
    }

}
