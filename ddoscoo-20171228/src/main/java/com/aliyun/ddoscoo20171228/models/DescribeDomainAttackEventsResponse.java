// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDomainAttackEventsResponse setBody(DescribeDomainAttackEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainAttackEventsResponseBody getBody() {
        return this.body;
    }

}
