// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnWafDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCdnWafDomainResponse setBody(DescribeCdnWafDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnWafDomainResponseBody getBody() {
        return this.body;
    }

}
