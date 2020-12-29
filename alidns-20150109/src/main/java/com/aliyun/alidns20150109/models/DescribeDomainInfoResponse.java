// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainInfoResponseBody body;

    public static DescribeDomainInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainInfoResponse self = new DescribeDomainInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainInfoResponse setBody(DescribeDomainInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainInfoResponseBody getBody() {
        return this.body;
    }

}
