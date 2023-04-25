// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainSecurityProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainSecurityProfileResponseBody body;

    public static DescribeDomainSecurityProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecurityProfileResponse self = new DescribeDomainSecurityProfileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecurityProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSecurityProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSecurityProfileResponse setBody(DescribeDomainSecurityProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSecurityProfileResponseBody getBody() {
        return this.body;
    }

}
