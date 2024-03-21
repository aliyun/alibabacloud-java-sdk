// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaConnDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainIpaConnDataResponseBody body;

    public static DescribeDcdnDomainIpaConnDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIpaConnDataResponse self = new DescribeDcdnDomainIpaConnDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIpaConnDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainIpaConnDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainIpaConnDataResponse setBody(DescribeDcdnDomainIpaConnDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainIpaConnDataResponseBody getBody() {
        return this.body;
    }

}
