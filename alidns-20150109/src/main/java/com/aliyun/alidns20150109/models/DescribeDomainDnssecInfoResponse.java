// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainDnssecInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDomainDnssecInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainDnssecInfoResponse setBody(DescribeDomainDnssecInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainDnssecInfoResponseBody getBody() {
        return this.body;
    }

}
