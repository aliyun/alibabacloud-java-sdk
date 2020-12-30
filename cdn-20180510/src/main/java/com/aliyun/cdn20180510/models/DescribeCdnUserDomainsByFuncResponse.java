// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserDomainsByFuncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCdnUserDomainsByFuncResponse setBody(DescribeCdnUserDomainsByFuncResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnUserDomainsByFuncResponseBody getBody() {
        return this.body;
    }

}
