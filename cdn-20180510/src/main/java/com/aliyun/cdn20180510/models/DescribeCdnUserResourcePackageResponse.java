// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCdnUserResourcePackageResponse setBody(DescribeCdnUserResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnUserResourcePackageResponseBody getBody() {
        return this.body;
    }

}
