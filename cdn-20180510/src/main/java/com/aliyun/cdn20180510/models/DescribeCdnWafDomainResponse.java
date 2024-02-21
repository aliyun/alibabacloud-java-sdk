// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnWafDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnWafDomainResponseBody body;

    public static DescribeCdnWafDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnWafDomainResponse self = new DescribeCdnWafDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnWafDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnWafDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnWafDomainResponse setBody(DescribeCdnWafDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnWafDomainResponseBody getBody() {
        return this.body;
    }

}
