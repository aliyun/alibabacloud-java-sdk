// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnUserResourcePackageResponseBody body;

    public static DescribeDcdnUserResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserResourcePackageResponse self = new DescribeDcdnUserResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserResourcePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnUserResourcePackageResponse setBody(DescribeDcdnUserResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserResourcePackageResponseBody getBody() {
        return this.body;
    }

}
