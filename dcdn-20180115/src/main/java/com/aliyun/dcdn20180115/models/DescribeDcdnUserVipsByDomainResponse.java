// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserVipsByDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnUserVipsByDomainResponseBody body;

    public static DescribeDcdnUserVipsByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserVipsByDomainResponse self = new DescribeDcdnUserVipsByDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserVipsByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserVipsByDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnUserVipsByDomainResponse setBody(DescribeDcdnUserVipsByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserVipsByDomainResponseBody getBody() {
        return this.body;
    }

}
