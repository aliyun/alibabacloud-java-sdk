// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainAttackEventsResponseBody body;

    public static DescribeDomainAttackEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackEventsResponse self = new DescribeDomainAttackEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainAttackEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainAttackEventsResponse setBody(DescribeDomainAttackEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainAttackEventsResponseBody getBody() {
        return this.body;
    }

}
