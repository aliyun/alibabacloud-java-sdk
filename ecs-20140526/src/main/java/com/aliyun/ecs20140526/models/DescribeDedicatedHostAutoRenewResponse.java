// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAutoRenewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDedicatedHostAutoRenewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDedicatedHostAutoRenewResponse setBody(DescribeDedicatedHostAutoRenewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostAutoRenewResponseBody getBody() {
        return this.body;
    }

}
