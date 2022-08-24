// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnL2VipsByDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnL2VipsByDomainResponseBody body;

    public static DescribeDcdnL2VipsByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnL2VipsByDomainResponse self = new DescribeDcdnL2VipsByDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnL2VipsByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnL2VipsByDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnL2VipsByDomainResponse setBody(DescribeDcdnL2VipsByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnL2VipsByDomainResponseBody getBody() {
        return this.body;
    }

}
