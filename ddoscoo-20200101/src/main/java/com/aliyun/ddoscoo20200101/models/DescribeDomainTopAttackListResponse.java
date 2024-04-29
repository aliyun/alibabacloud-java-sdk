// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopAttackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainTopAttackListResponseBody body;

    public static DescribeDomainTopAttackListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopAttackListResponse self = new DescribeDomainTopAttackListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopAttackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainTopAttackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainTopAttackListResponse setBody(DescribeDomainTopAttackListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainTopAttackListResponseBody getBody() {
        return this.body;
    }

}
