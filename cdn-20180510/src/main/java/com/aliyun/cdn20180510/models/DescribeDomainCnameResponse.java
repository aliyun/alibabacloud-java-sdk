// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainCnameResponseBody body;

    public static DescribeDomainCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCnameResponse self = new DescribeDomainCnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainCnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainCnameResponse setBody(DescribeDomainCnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainCnameResponseBody getBody() {
        return this.body;
    }

}
