// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsByFuncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnUserDomainsByFuncResponseBody body;

    public static DescribeDcdnUserDomainsByFuncResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserDomainsByFuncResponse self = new DescribeDcdnUserDomainsByFuncResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserDomainsByFuncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserDomainsByFuncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnUserDomainsByFuncResponse setBody(DescribeDcdnUserDomainsByFuncResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserDomainsByFuncResponseBody getBody() {
        return this.body;
    }

}
