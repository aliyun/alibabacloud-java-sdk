// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDedicatedHostClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDedicatedHostClustersResponse setBody(DescribeDedicatedHostClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostClustersResponseBody getBody() {
        return this.body;
    }

}
