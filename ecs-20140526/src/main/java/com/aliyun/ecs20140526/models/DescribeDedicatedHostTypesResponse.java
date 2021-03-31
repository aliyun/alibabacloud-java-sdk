// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedHostTypesResponseBody body;

    public static DescribeDedicatedHostTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostTypesResponse self = new DescribeDedicatedHostTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedHostTypesResponse setBody(DescribeDedicatedHostTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostTypesResponseBody getBody() {
        return this.body;
    }

}
