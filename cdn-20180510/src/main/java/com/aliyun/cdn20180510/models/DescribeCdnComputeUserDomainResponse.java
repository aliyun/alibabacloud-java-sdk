// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnComputeUserDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnComputeUserDomainResponseBody body;

    public static DescribeCdnComputeUserDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnComputeUserDomainResponse self = new DescribeCdnComputeUserDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnComputeUserDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnComputeUserDomainResponse setBody(DescribeCdnComputeUserDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnComputeUserDomainResponseBody getBody() {
        return this.body;
    }

}
