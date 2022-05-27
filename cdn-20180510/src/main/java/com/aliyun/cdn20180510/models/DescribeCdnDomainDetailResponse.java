// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnDomainDetailResponseBody body;

    public static DescribeCdnDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainDetailResponse self = new DescribeCdnDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnDomainDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnDomainDetailResponse setBody(DescribeCdnDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnDomainDetailResponseBody getBody() {
        return this.body;
    }

}
