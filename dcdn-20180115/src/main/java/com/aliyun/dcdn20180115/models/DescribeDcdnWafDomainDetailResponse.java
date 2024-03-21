// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafDomainDetailResponseBody body;

    public static DescribeDcdnWafDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDomainDetailResponse self = new DescribeDcdnWafDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafDomainDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafDomainDetailResponse setBody(DescribeDcdnWafDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafDomainDetailResponseBody getBody() {
        return this.body;
    }

}
