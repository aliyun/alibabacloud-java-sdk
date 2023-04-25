// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackEventListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainAttackEventListResponseBody body;

    public static DescribeDomainAttackEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackEventListResponse self = new DescribeDomainAttackEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainAttackEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainAttackEventListResponse setBody(DescribeDomainAttackEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainAttackEventListResponseBody getBody() {
        return this.body;
    }

}
