// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnUserResourcePackageResponseBody body;

    public static DescribeCdnUserResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserResourcePackageResponse self = new DescribeCdnUserResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnUserResourcePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnUserResourcePackageResponse setBody(DescribeCdnUserResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnUserResourcePackageResponseBody getBody() {
        return this.body;
    }

}
