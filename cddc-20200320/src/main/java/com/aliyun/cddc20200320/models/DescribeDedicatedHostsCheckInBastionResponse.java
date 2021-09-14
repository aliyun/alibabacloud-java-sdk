// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsCheckInBastionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedHostsCheckInBastionResponseBody body;

    public static DescribeDedicatedHostsCheckInBastionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsCheckInBastionResponse self = new DescribeDedicatedHostsCheckInBastionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsCheckInBastionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedHostsCheckInBastionResponse setBody(DescribeDedicatedHostsCheckInBastionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostsCheckInBastionResponseBody getBody() {
        return this.body;
    }

}
