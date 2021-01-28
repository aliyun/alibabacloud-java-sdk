// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnIpaDomainDetailResponseBody body;

    public static DescribeDcdnIpaDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaDomainDetailResponse self = new DescribeDcdnIpaDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnIpaDomainDetailResponse setBody(DescribeDcdnIpaDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnIpaDomainDetailResponseBody getBody() {
        return this.body;
    }

}
