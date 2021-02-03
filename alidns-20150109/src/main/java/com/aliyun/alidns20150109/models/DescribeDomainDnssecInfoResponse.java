// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainDnssecInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainDnssecInfoResponseBody body;

    public static DescribeDomainDnssecInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDnssecInfoResponse self = new DescribeDomainDnssecInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDnssecInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainDnssecInfoResponse setBody(DescribeDomainDnssecInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainDnssecInfoResponseBody getBody() {
        return this.body;
    }

}
