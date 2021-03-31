// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAutoRenewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedHostAutoRenewResponseBody body;

    public static DescribeDedicatedHostAutoRenewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostAutoRenewResponse self = new DescribeDedicatedHostAutoRenewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostAutoRenewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedHostAutoRenewResponse setBody(DescribeDedicatedHostAutoRenewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostAutoRenewResponseBody getBody() {
        return this.body;
    }

}
