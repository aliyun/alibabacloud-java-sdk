// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnIpaDomainConfigsResponseBody body;

    public static DescribeDcdnIpaDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaDomainConfigsResponse self = new DescribeDcdnIpaDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnIpaDomainConfigsResponse setBody(DescribeDcdnIpaDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnIpaDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
