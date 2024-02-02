// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClusterDisksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDedicatedBlockStorageClusterDisksResponseBody body;

    public static DescribeDedicatedBlockStorageClusterDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedBlockStorageClusterDisksResponse self = new DescribeDedicatedBlockStorageClusterDisksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedBlockStorageClusterDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedBlockStorageClusterDisksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDedicatedBlockStorageClusterDisksResponse setBody(DescribeDedicatedBlockStorageClusterDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedBlockStorageClusterDisksResponseBody getBody() {
        return this.body;
    }

}
