// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedBlockStorageClustersResponseBody body;

    public static DescribeDedicatedBlockStorageClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedBlockStorageClustersResponse self = new DescribeDedicatedBlockStorageClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedBlockStorageClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedBlockStorageClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDedicatedBlockStorageClustersResponse setBody(DescribeDedicatedBlockStorageClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedBlockStorageClustersResponseBody getBody() {
        return this.body;
    }

}
