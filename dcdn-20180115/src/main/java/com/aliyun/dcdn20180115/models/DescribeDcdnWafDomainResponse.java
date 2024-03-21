// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafDomainResponseBody body;

    public static DescribeDcdnWafDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDomainResponse self = new DescribeDcdnWafDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafDomainResponse setBody(DescribeDcdnWafDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafDomainResponseBody getBody() {
        return this.body;
    }

}
