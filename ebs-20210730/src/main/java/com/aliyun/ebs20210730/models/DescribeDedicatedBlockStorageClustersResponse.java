// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
