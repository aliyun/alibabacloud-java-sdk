// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsInBastionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedHostsInBastionResponseBody body;

    public static DescribeDedicatedHostsInBastionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsInBastionResponse self = new DescribeDedicatedHostsInBastionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsInBastionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedHostsInBastionResponse setBody(DescribeDedicatedHostsInBastionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostsInBastionResponseBody getBody() {
        return this.body;
    }

}
