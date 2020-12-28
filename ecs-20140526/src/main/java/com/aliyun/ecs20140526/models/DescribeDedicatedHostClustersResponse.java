// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedHostClustersResponseBody body;

    public static DescribeDedicatedHostClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostClustersResponse self = new DescribeDedicatedHostClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedHostClustersResponse setBody(DescribeDedicatedHostClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostClustersResponseBody getBody() {
        return this.body;
    }

}
