// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserDomainsByFuncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnUserDomainsByFuncResponseBody body;

    public static DescribeCdnUserDomainsByFuncResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserDomainsByFuncResponse self = new DescribeCdnUserDomainsByFuncResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserDomainsByFuncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnUserDomainsByFuncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnUserDomainsByFuncResponse setBody(DescribeCdnUserDomainsByFuncResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnUserDomainsByFuncResponseBody getBody() {
        return this.body;
    }

}
