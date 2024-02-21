// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDedicatedClusterResponseBody body;

    public static DescribeDedicatedClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterResponse self = new DescribeDedicatedClusterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDedicatedClusterResponse setBody(DescribeDedicatedClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedClusterResponseBody getBody() {
        return this.body;
    }

}
