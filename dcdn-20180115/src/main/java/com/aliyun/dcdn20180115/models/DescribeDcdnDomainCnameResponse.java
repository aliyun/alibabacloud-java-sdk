// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainCnameResponseBody body;

    public static DescribeDcdnDomainCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCnameResponse self = new DescribeDcdnDomainCnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainCnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainCnameResponse setBody(DescribeDcdnDomainCnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainCnameResponseBody getBody() {
        return this.body;
    }

}
