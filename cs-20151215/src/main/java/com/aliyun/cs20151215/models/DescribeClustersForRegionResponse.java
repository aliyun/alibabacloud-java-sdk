// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersForRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClustersForRegionResponseBody body;

    public static DescribeClustersForRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersForRegionResponse self = new DescribeClustersForRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClustersForRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClustersForRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClustersForRegionResponse setBody(DescribeClustersForRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClustersForRegionResponseBody getBody() {
        return this.body;
    }

}
