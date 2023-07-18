// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnDomainResponseBody body;

    public static DescribeCdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainResponse self = new DescribeCdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnDomainResponse setBody(DescribeCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnDomainResponseBody getBody() {
        return this.body;
    }

}
